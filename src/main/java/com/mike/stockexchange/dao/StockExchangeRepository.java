package com.mike.stockexchange.dao;

import com.mike.stockexchange.entity.StockExchange;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @Description:
 * @Author: Mike Dong
 * @Date: 2019/12/3 20:48.
 */
public interface StockExchangeRepository extends CrudRepository<StockExchange, Integer> {

    @Query("from StockExchange")
    List<StockExchange> findAllStockExchange();

    @Modifying
    @Query("update StockExchange u set u.stockExchange=?1, u.contactAddress=?2, u.brief=?3 where u.id=?4")
    void updateStockExchangeById(String stockExchange, String contactAddress, String brief, long id);

}
