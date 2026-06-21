// Stock.java
package com.example.finance.model;

import java.util.Objects;

public class Stock {
    private Long id;
    private String symbol;
    private String sector;
    private Double price;
    private Double marketCap;

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(Double marketCap) {
        this.marketCap = marketCap;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Objects.equals(id, stock.id) && Objects.equals(symbol, stock.symbol) && Objects.equals(sector, stock.sector) && Objects.equals(price, stock.price) && Objects.equals(marketCap, stock.marketCap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, symbol, sector, price, marketCap);
    }
}
