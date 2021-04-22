package com.example.fibweb;

import com.example.fibweb.controller.FibonacciController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.web.client.RestClientException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class FibWebApplicationIT {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void mainShouldNotThrow() {
        assertDoesNotThrow(() -> {
            FibWebApplication.main(new String[] {});
        });
    }
    @Test
    void fibonacciShouldReturnNumber() throws Exception, RestClientException {
        var result = restTemplate.getForObject("http://localhost:" + port + "/compute/8", Integer.class);
        assertEquals(21, result);
    }
}
