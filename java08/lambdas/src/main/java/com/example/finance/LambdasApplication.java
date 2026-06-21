package com.example.finance;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.finance.mapper")
public class LambdasApplication {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(LambdasApplication.class, args);
    }
}
