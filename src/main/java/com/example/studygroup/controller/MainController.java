package com.example.studygroup.controller;

import com.example.studygroup.common.ApiResponse;
import com.example.studygroup.repository.entity.Users;
import com.example.studygroup.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class MainController {


    // 테스트
    private final UserService userService;

    @GetMapping("/")
    public String getAllUsers() {
        return "index";
    }

}

