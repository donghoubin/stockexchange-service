package com.mike.stockexchange.service;

import com.mike.stockexchange.entity.StockExchange;

import java.util.List;

/**
 * @Description:
 * @Author: Mike Dong
 * @Date: 2019/12/3 20:47.
 */
public interface StockExchangeService {
    void createStockExchange(StockExchange stockExchange);

    List<StockExchange> retrieveAllStockExchanges();

    void editStockExchange(StockExchange stockExchange);
}
