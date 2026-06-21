package com.example.finance.mapper;

import com.example.finance.model.Transaction;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TransactionMapper {
    List<Transaction> findAll();
}
