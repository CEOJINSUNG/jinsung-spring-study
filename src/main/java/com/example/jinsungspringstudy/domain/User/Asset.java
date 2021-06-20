package com.example.jinsungspringstudy.domain.User;

import com.example.jinsungspringstudy.domain.Product.Product;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "asset")
public class Asset {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Product product;
    private BigDecimal productQuantity;
}
