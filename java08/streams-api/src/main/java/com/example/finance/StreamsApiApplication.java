package com.example.finance;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.security.autoconfigure.SecurityAutoConfiguration;
import org.springframework.boot.security.autoconfigure.UserDetailsServiceAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class, UserDetailsServiceAutoConfiguration.class})
@MapperScan("com.example.finance.mapper")
public class StreamsApiApplication {
        public static void main(String[] args) {
            org.springframework.boot.SpringApplication.run(StreamsApiApplication.class, args);
        }
}
