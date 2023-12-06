package com.example;

import com.example.api.LogApi;
import com.example.api.XMLLog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@ActiveProfiles({"test"})
class SpringBootCustomAutoConfigTests {

    @Autowired
    private LogApi logApi;

    @Test
    void testLogApiClassBean() {
        assertNotNull(logApi);
        assertInstanceOf(XMLLog.class, logApi);
    }

}
