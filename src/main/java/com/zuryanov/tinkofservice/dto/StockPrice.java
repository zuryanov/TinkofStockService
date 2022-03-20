package com.zuryanov.tinkofservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

@AllArgsConstructor
@Value
@Data
public class StockPrice {
    private String figi;
    private Double price;
}
