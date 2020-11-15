package com.propgrammers.bidbird.test;

import org.junit.jupiter.api.Tag;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@Tag("context-test")
@SpringBootTest
@ActiveProfiles("test")
public abstract class ContextTest {
}
