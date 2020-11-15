package com.propgrammers.bidbird.clients;

import com.propgrammers.bidbird.test.ContextTest;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("openapi-client")
public class OpenApiClientContextTest extends ContextTest {

    @Test
    void contextLoad() {
        assertThat(true).isTrue();
    }
}
