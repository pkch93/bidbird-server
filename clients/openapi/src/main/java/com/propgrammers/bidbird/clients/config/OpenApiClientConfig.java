package com.propgrammers.bidbird.clients.config;

import com.propgrammers.bidbird.clients.OpenApiClient;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "bidbird")
public class OpenApiClientConfig {

    private OpenApiClientProperties openApi;

    @Bean
    public OpenApiClient openApiClient() {
        return new OpenApiClient(openApi);
    }
}
