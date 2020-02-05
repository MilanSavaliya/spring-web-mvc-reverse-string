package com.milan.mvcreversestring.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.milan.mvcreversestring.dto.request.ReverseStringRequestDTO;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;

class ReverseSentenceRestControllerTest extends AbstractTest {

    @Override
    @BeforeEach
    public void setUp() {
        super.setUp();
    }

    @Test
    public void testReverse() throws Exception {
        String uri = "/v1/reverse";
        String requestBody = mapToJson(new ReverseStringRequestDTO("Good Morning!"));
        System.out.println(requestBody);
        MvcResult mvcResult = mvc.perform(
                MockMvcRequestBuilders.post(uri)
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(requestBody)
        ).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals("{\"output\":\"Morning! Good\",\"success\":true,\"status\":\"OK\"}", content);
    }

}