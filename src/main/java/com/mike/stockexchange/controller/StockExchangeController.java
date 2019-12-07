package com.mike.stockexchange.controller;

import com.mike.stockexchange.entity.StockExchange;
import com.mike.stockexchange.service.StockExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: Mike Dong
 * @Date: 2019/12/3 20:47.
 */
@Controller
public class StockExchangeController {

    @Autowired
    private StockExchangeService stockExchangeService;

    @PostMapping("/stockexchange")
    public ResponseEntity<Void> addStockExchange(@RequestBody StockExchange stockExchange) {
        stockExchangeService.createStockExchange(stockExchange);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @PutMapping("/stockexchange")
    public ResponseEntity<Void> editStockExchange(@RequestBody StockExchange stockExchange) {
        stockExchangeService.editStockExchange(stockExchange);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @GetMapping("/stockexchanges")
    public ResponseEntity<List<StockExchange>> getStockExchangesList() {
        List<StockExchange> stockExchangeList = new ArrayList<>();
        stockExchangeList = stockExchangeService.retrieveAllStockExchanges();
        return new ResponseEntity<>(stockExchangeList, HttpStatus.OK);
    }
}
