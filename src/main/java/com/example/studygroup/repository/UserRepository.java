package com.example.studygroup.repository;

import com.example.studygroup.repository.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}