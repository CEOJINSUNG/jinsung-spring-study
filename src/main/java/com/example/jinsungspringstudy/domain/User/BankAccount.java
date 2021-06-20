package com.example.jinsungspringstudy.domain.User;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "bankaccount")
public class BankAccount {
    @Id
    @GeneratedValue
    private Long id;
    private String accountNumber;
    @OneToOne
    private Bank bank;
    private String virtualAccountNumber;
    @OneToOne
    private Bank virtualAccountBank;
    private int balance;
}
