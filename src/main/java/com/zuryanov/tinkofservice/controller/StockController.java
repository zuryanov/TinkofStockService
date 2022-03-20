package com.zuryanov.tinkofservice.controller;

import com.zuryanov.tinkofservice.dto.FigiesDto;
import com.zuryanov.tinkofservice.dto.StocksDto;
import com.zuryanov.tinkofservice.dto.StocksPricesDto;
import com.zuryanov.tinkofservice.dto.TickersDto;
import com.zuryanov.tinkofservice.model.Stock;
import com.zuryanov.tinkofservice.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class StockController {

    private final StockService stockService;

    @GetMapping("/stocks/{ticket}")
    public Stock getStock(@PathVariable String ticket) {
        return stockService.getStockByTicker(ticket);
    }

    @PostMapping("/stocks/getStocksByTickers")
    public StocksDto getStocksByTickers(@RequestBody TickersDto tickersDto) {
        return stockService.getStocksByTickers(tickersDto);
    }

    @PostMapping("/prices")
    public StocksPricesDto getPrices(@RequestBody FigiesDto figiesDto) {
        return stockService.getPrices(figiesDto);
    }
}
