package com.example.studygroup.repository.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String email;

    private String password;

    private String phoneNumber;

    private String role;  // Could be an Enum

    private boolean isActive;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    // getters and setters
}