package com.propgrammers.bidbird.clients;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HostProperties {

    private String protocol;

    private String host;

    private String port;

    private Map<String, String> headers;

    private Integer connectionTimeout;

    private long timeout;

    public String baseUrl() {
        return String.format("%s://%s:%s", protocol, host, port);
    }
}
