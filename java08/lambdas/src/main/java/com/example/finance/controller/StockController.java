package com.example.finance.controller;

import com.example.finance.model.Stock;
import com.example.finance.service.StockService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Stocks", description = "Endpoints for stock reporting")
@RestController
@RequestMapping("/stocks")
public class StockController {
    private final StockService service;

    public StockController(StockService service) {
        this.service = service;
    }

    @Operation(summary = "Get sorted stocks", description = "Returns stocks sorted by price, market cap, or sector then price")
    @GetMapping("/sorted/price")
    public List<Stock> sortByPrice() {
        return service.sortByPrice();
    }

    @Operation(summary = "Get stocks sorted by market cap", description = "Returns stocks sorted by market capitalization")
    @GetMapping("/sorted/marketcap")
    public List<Stock> sortByMarketCap() {
        return service.sortByMarketCap();
    }

    @Operation(summary = "Get stocks sorted by sector and price", description = "Returns stocks sorted by sector first, then by price")
    @GetMapping("/sorted/sector-price")
    public List<Stock> sortBySectorThenPrice() {
        return service.sortBySectorThenPrice();
    }
}
