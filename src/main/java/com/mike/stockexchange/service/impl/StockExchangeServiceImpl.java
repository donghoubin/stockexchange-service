package com.mike.stockexchange.service.impl;

import com.mike.stockexchange.dao.StockExchangeRepository;
import com.mike.stockexchange.entity.StockExchange;
import com.mike.stockexchange.service.StockExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description:
 * @Author: Mike Dong
 * @Date: 2019/12/3 20:47.
 */
@Service
public class StockExchangeServiceImpl implements StockExchangeService {

    @Autowired
    private StockExchangeRepository stockExchangeRepository;

    @Override
    public void createStockExchange(StockExchange stockExchange) {
        stockExchangeRepository.save(stockExchange);
    }

    @Override
    public List<StockExchange> retrieveAllStockExchanges() {
        return stockExchangeRepository.findAllStockExchange();
    }

    @Override
    @Transactional
    public void editStockExchange(StockExchange stockExchange) {
        stockExchangeRepository.updateStockExchangeById(
                stockExchange.getStockExchange(), stockExchange.getContactAddress(), stockExchange.getBrief(), stockExchange.getId());
    }
}
