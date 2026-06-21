package com.example.finance.controller;

import com.example.finance.service.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @GetMapping("/report")
    public Map<String, Object> report() {
        Map<String, Object> result = new HashMap<>();
        result.put("totals", service.accountTotals());
        result.put("suspicious", service.suspiciousTransactions(10000));
        return result;
    }
}
