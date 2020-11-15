package com.propgrammers.bidbird;

import com.propgrammers.bidbird.test.ClientTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("openapi-client")
public abstract class OpenApiClientTest extends ClientTest {
}
