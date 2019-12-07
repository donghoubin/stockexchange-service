package com.mike.stockexchange.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Description:
 * @Author: Mike Dong
 * @Date: 2019/12/3 20:48.
 */
@Entity
@Table(name = "stock_exchange")
@Data
public class StockExchange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "stockexchange")
    private String stockExchange;

    @Column(name = "brief")
    private String brief;

    @Column(name = "contactaddress")
    private String contactAddress;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStockExchange() {
        return stockExchange;
    }

    public void setStockExchange(String stockExchange) {
        this.stockExchange = stockExchange;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }
}
