package com.inclusioncloud.interview.controller;

import com.inclusioncloud.interview.service.MaxKService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MaxKController.class)
public class MaxKControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MaxKService maxKService;

    @Test
    public void getMaxK_ReturnsMaxK() throws Exception {
        int x = 7, y = 5, n = 12345;
        int expectedK = 12339;
        given(maxKService.findMaxK(x, y, n)).willReturn(expectedK);

        mockMvc.perform(get("/api/max-k")
                        .param("x", String.valueOf(x))
                        .param("y", String.valueOf(y))
                        .param("n", String.valueOf(n))
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(expectedK)));
    }

    @Test
    public void calculateMaxK_ReturnsMaxK() throws Exception {
        int x = 7, y = 5, n = 12345;
        int expectedK = 12339;
        given(maxKService.findMaxK(x, y, n)).willReturn(expectedK);

        mockMvc.perform(post("/api/max-k/calculate")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"x\":" + x + ",\"y\":" + y + ",\"n\":" + n + "}")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(expectedK)));
    }
}