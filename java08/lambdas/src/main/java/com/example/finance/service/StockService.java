package com.example.finance.service;

import com.example.finance.mapper.StockMapper;
import com.example.finance.model.Stock;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class StockService {
    private final StockMapper mapper;

    public StockService(StockMapper mapper) {
        this.mapper = mapper;
    }

    public List<Stock> sortByPrice() {
        return mapper.findAll().stream()
                .sorted(Comparator.comparingDouble(Stock::getPrice))
                .toList();
    }

    public List<Stock> sortByMarketCap() {
        return mapper.findAll().stream()
                .sorted(Comparator.comparingDouble(Stock::getMarketCap).reversed())
                .toList();
    }

    public List<Stock> sortBySectorThenPrice() {
        return mapper.findAll().stream()
                .sorted(Comparator.comparing(Stock::getSector)
                        .thenComparing(Stock::getPrice))
                .toList();
    }
}
