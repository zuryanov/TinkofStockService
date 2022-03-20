package com.zuryanov.tinkofservice.service;

import com.zuryanov.tinkofservice.dto.*;
import com.zuryanov.tinkofservice.model.Stock;

public interface StockService {
    Stock getStockByTicker(String ticker);
    StocksDto getStocksByTickers(TickersDto tickers);
    StocksPricesDto getPrices(FigiesDto figiesDto);
}
