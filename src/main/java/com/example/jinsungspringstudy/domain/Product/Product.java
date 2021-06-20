package com.example.jinsungspringstudy.domain.Product;


import lombok.*;

import javax.persistence.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String abbreviationName;
    private String fullName;
    private String imageUrl;

    @ManyToOne
    private Market market;
}
