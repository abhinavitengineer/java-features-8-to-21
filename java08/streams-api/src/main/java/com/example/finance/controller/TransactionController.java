package com.example.finance.controller;

import com.example.finance.service.TransactionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Tag(name = "Transactions", description = "Endpoints for transaction reporting")
@RestController
@RequestMapping("/transactions")
public class TransactionController {
    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @Operation(summary = "Get transaction report", description = "Returns total transactions and suspicious transactions")
    @GetMapping("/report")
    public Map<String, Object> report() {
        Map<String, Object> result = new HashMap<>();
        result.put("totals", service.accountTotals());
        result.put("suspicious", service.suspiciousTransactions(10000));
        return result;
    }
}
