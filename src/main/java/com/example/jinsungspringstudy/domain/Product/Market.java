package com.example.jinsungspringstudy.domain.Product;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name="market")
public class Market {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int transactionFeeRate;
}
