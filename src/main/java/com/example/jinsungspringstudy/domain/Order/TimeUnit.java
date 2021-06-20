package com.example.jinsungspringstudy.domain.Order;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@RequiredArgsConstructor
@Data
@Entity
@Table(name = "timeunit")
public class TimeUnit {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
