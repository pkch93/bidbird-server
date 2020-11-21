package com.propgrammers.bidbird.clients;

import com.propgrammers.bidbird.OpenApiClientTest;
import com.propgrammers.bidbird.clients.dto.BidCodeResponse;
import com.propgrammers.bidbird.clients.dto.BidPropertiesResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@Deprecated
class OpenApiForRealClientTest extends OpenApiClientTest {

    @Autowired
    private OpenApiClient dut;

    @Test
    @DisplayName("[코드정보조회] openAPI 실제 찔러보는 테스트")
    void getBidCode() {
        BidCodeResponse actual = dut.getBidCode(1, 20).block();

        assertThat(actual).isNotNull();
    }

    @Test
    @DisplayName("[공매물건조회] openAPI 실제 찔러보는 테스트")
    void getBidProperties() {
        BidPropertiesResponse actual = dut.getBidProperties(1, 20).block();

        assertThat(actual).isNotNull();
    }
}