package com.example.jinsungspringstudy.domain.Order;

import com.example.jinsungspringstudy.domain.Product.Product;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Product product;
    private LocalDateTime tradedAt;
    private BigDecimal quantity;
    private BigDecimal price;
    @OneToOne
    private Order sellingOrder;
    @OneToOne
    private Order buyingOrder;
}
