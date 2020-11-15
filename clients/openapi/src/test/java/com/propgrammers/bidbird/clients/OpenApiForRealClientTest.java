package com.propgrammers.bidbird.clients;

import com.propgrammers.bidbird.OpenApiClientTest;
import com.propgrammers.bidbird.clients.dto.BidCodeResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@Deprecated
class OpenApiForRealClientTest extends OpenApiClientTest {

    @Autowired
    private OpenApiClient dut;

    @Disabled
    @Test
    @DisplayName("openAPI 실제 찔러보는 테스트")
    void forTest() {
        BidCodeResponse actual = dut.getBidCode(1, 20).block();

        assertThat(actual).isNotNull();
    }
}