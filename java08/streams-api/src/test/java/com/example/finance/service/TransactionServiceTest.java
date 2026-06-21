package com.example.finance.service;

import com.example.finance.model.Transaction;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class TransactionServiceTest {
    @Autowired
    private TransactionService service;

    @Test
    void testSuspiciousTransactions() {
        List<Transaction> suspicious = service.suspiciousTransactions(10000);
        assertFalse(suspicious.isEmpty());
    }
}
