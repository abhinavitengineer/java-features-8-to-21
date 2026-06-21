package com.example.finance.mapper;

import com.example.finance.model.Stock;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockMapper {
    List<Stock> findAll();
}
