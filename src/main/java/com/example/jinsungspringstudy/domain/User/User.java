package com.example.jinsungspringstudy.domain.User;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "name")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String nickName;
    private String email;
    private String password;
    @OneToOne
    private BankAccount bankAccount;
    private Boolean isActive;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
