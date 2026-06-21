CREATE TABLE stocks (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    symbol VARCHAR(10),
    sector VARCHAR(50),
    price DOUBLE,
    market_cap DOUBLE
);