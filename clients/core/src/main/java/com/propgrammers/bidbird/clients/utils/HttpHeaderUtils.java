package com.propgrammers.bidbird.clients.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;

import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HttpHeaderUtils {

    public static MultiValueMap<String, String> toHttpHeaders(Map<String, String> map) {
        MultiValueMap<String, String> httpHeaders = new HttpHeaders();
        httpHeaders.setAll(map);

        return httpHeaders;
    }
}
