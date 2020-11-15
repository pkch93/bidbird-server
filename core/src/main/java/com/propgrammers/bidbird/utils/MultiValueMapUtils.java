package com.propgrammers.bidbird.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.List;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MultiValueMapUtils {

    public static MultiValueMap<String, String> toMultiValueMap(Map<String, String> map) {
        MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
        multiValueMap.setAll(map);

        return multiValueMap;
    }

    public static Builder<String, String> queryParamsBuilder() {
        return new Builder<>();
    }

    public static class Builder<K, V> {
        private MultiValueMap<K, V> multiValueMap = new LinkedMultiValueMap<>();

        private Builder() {}

        public Builder<K, V> addEntry(K key, V value) {
            multiValueMap.add(key, value);
            return this;
        }

        public Builder<K, V> addEntry(K key, List<V> values) {
            multiValueMap.addAll(key, values);
            return this;
        }

        public MultiValueMap<K, V> build() {
            return multiValueMap;
        }
    }
}
