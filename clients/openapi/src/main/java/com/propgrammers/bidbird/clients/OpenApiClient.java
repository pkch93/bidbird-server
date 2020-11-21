package com.propgrammers.bidbird.clients;

import com.propgrammers.bidbird.clients.config.OpenApiClientProperties;
import com.propgrammers.bidbird.clients.dto.BidCodeResponse;
import com.propgrammers.bidbird.clients.dto.BidPropertiesResponse;
import com.propgrammers.bidbird.utils.MultiValueMapUtils;
import org.springframework.util.MultiValueMap;
import reactor.core.publisher.Mono;

public class OpenApiClient extends CommonClient {
    private static final String BID_CODE_PATH = "/openapi/services/OnbidCodeInfoInquireSvc/getOnbidTopCodeInfo";
    private static final String BID_PROPERTY_PATH = "/openapi/services/KamcoPblsalThingInquireSvc/getKamcoPbctCltrList";

    private final String serviceKey;

    public OpenApiClient(OpenApiClientProperties properties) {
        super(properties.getHost());
        this.serviceKey = properties.getServiceKey();
    }

    public Mono<BidCodeResponse> getBidCode(long page, long size) {
        MultiValueMap<String, String> queryParams = MultiValueMapUtils.queryParamsBuilder()
                .addEntry("serviceKey", serviceKey)
                .addEntry("numOfRows", Long.toString(size))
                .addEntry("pageNo", Long.toString(page))
                .build();

        return webClient.get()
                .uri(builder -> builder
                        .path(BID_CODE_PATH)
                        .queryParams(queryParams)
                        .build()
                )
                .retrieve()
                .bodyToMono(BidCodeResponse.class);
    }

    public Mono<BidPropertiesResponse> getBidProperties(long page, long size) {
        MultiValueMap<String, String> queryParams = MultiValueMapUtils.queryParamsBuilder()
                .addEntry("serviceKey", serviceKey)
                .addEntry("numOfRows", Long.toString(size))
                .addEntry("pageNo", Long.toString(page))
                .build();

        return webClient.get()
                .uri(builder -> builder
                        .path(BID_PROPERTY_PATH)
                        .queryParams(queryParams)
                        .build()
                )
                .retrieve()
                .bodyToMono(BidPropertiesResponse.class);
    }
}
