package com.example.jinsungspringstudy.domain.User;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
@Entity
@Table(name = "bank")
public class Bank {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
