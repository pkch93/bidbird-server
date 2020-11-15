package com.propgrammers.bidbird.clients;

import com.propgrammers.bidbird.clients.config.OpenApiClientProperties;
import com.propgrammers.bidbird.clients.dto.BidCodeResponse;
import reactor.core.publisher.Mono;

public class OpenApiClient extends CommonClient {
    private static final String BID_CODE_PATH = "/openapi/services/OnbidCodeInfoInquireSvc/getOnbidTopCodeInfo";

    private final String serviceKey;

    public OpenApiClient(OpenApiClientProperties properties) {
        super(properties.getHost());
        this.serviceKey = properties.getServiceKey();
    }

    public Mono<BidCodeResponse> getBidCode(long page, long size) {
        return webClient.get()
                .uri(builder -> builder
                        .path(BID_CODE_PATH)
                        .queryParam("serviceKey", serviceKey)
                        .queryParam("numOfRows", size)
                        .queryParam("pageNo", page)
                        .build()
                )
                .retrieve()
                .bodyToMono(BidCodeResponse.class);
    }
}
