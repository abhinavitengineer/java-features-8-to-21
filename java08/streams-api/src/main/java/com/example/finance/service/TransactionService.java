package com.example.finance.service;

import com.example.finance.mapper.TransactionMapper;
import com.example.finance.model.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class TransactionService {
    private final TransactionMapper mapper;

    public TransactionService(TransactionMapper mapper) {
        this.mapper = mapper;
    }

    @Transactional(readOnly = true)
    public Map<String, Double> accountTotals() {
        return mapper.findAll().stream()
                .collect(Collectors.groupingBy(
                        Transaction::getAccountId,
                        Collectors.summingDouble(Transaction::getAmount)
                ));
    }

    @Transactional(readOnly = true)
    public List<Transaction> suspiciousTransactions(double threshold) {
        return mapper.findAll().stream()
                .filter(t -> t.getAmount() > threshold)
                .toList();
    }
}
