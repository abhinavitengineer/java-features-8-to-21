-- Create transactions table
CREATE TABLE transactions (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    account_id VARCHAR(20),
    amount DOUBLE,
    type VARCHAR(10)
);
