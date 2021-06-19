package com.example.jinsungspringstudy.domain.Order;

import com.example.jinsungspringstudy.domain.Product.Product;
import com.example.jinsungspringstudy.domain.User.User;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Product product;
    private int quantity;
    private int price;
    private int remainingQuantity;
    private String orderedAt;
    private Boolean buyOrSell;
    private Boolean status;
}
