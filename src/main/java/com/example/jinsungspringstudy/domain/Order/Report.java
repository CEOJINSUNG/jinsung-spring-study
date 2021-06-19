package com.example.jinsungspringstudy.domain.Order;

import com.example.jinsungspringstudy.domain.Product.Product;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

public class Report {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Product product;
    @ManyToOne
    private TimeUnit timeUnit;
    private BigDecimal openingPrice;
    private BigDecimal closingPrice;
    private BigDecimal highPrice;
    private BigDecimal lowPrice;
    private BigDecimal transactionVolume;
    private BigDecimal reportedTime;
}
