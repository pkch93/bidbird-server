package com.propgrammers.bidbird.clients;

import com.propgrammers.bidbird.clients.utils.HttpHeaderUtils;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import org.springframework.http.client.reactive.ClientHttpConnector;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;

import java.util.concurrent.TimeUnit;

public abstract class CommonClient {

    protected final WebClient webClient;

    public CommonClient(HostProperties hostProperties) {
        HttpClient httpClient = initializeHttpClient(hostProperties.getConnectionTimeout(), hostProperties.getTimeout());
        ClientHttpConnector connector = new ReactorClientHttpConnector(httpClient.wiretap(true));

        this.webClient = WebClient.builder()
                .baseUrl(hostProperties.baseUrl())
                .clientConnector(connector)
                .defaultHeaders(httpHeaders -> httpHeaders.addAll(
                        HttpHeaderUtils.toHttpHeaders(hostProperties.getHeaders()))
                )
                .build();
    }

    private HttpClient initializeHttpClient(Integer connectionTimeout, long timeout) {
        return HttpClient.create()
                .tcpConfiguration(client ->
                        client.option(ChannelOption.CONNECT_TIMEOUT_MILLIS, connectionTimeout)
                                .doOnConnected(connection -> connection
                                        .addHandlerLast(new ReadTimeoutHandler(timeout, TimeUnit.MILLISECONDS))
                                        .addHandlerLast(new WriteTimeoutHandler(timeout, TimeUnit.MILLISECONDS))
                                )
                );
    }
}
