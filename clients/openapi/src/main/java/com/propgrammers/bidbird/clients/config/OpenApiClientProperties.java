package com.propgrammers.bidbird.clients.config;

import com.propgrammers.bidbird.clients.HostProperties;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OpenApiClientProperties {

    private HostProperties host;

    private String serviceKey;
}
