package com.learn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_secure")
public class User {

    @Id
    private String userName;
    private String userPassword;
    private String email;
    private String role;
}
