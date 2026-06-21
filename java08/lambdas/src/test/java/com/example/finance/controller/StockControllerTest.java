package com.example.finance.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class StockControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testSortByPrice() throws Exception {
        mockMvc.perform(get("/stocks/sorted/price"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].symbol").value("JPM")); // lowest price first
    }

    @Test
    void testSortByMarketCap() throws Exception {
        mockMvc.perform(get("/stocks/sorted/marketcap"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].symbol").value("AAPL")); // largest market cap first
    }
}
