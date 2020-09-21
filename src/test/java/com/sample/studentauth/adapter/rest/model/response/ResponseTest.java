package com.sample.studentauth.adapter.rest.model.response;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest
public class ResponseTest {

    private static final Object test_response = "test_response";

    Response response = new Response();

    @Test
    public void constructorTest() {
        Response newResponse = new Response(test_response);
        assertNotNull(newResponse.getResponse());
    }

    @Test
    public void setMessageTest() {
        response.setResponse(test_response);
        Object actual = response.getResponse();
        assertEquals(test_response, actual);
    }

    @Test
    public void getMessageTest() {
        response.setResponse(test_response);
        Object actual = response.getResponse();
        assertEquals(test_response, actual);
    }
}
