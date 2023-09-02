package com.example.studygroup.controller.api;

import com.example.studygroup.common.ApiResponse;
import com.example.studygroup.repository.entity.Users;
import com.example.studygroup.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {


    // 테스트
    private final UserService userService;

    @GetMapping("/")
    public ApiResponse<List<Users>> getAllUsers() {
        return ApiResponse.setSuccessOkResponse(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ApiResponse<Users> getUserById(@PathVariable Long id) {
        Optional<Users> user = userService.getUserById(id);
        if (user.isPresent()) {
            return ApiResponse.setSuccessOkResponse(user.get());
        } else {
            return ApiResponse.setNotFoundResponse();
        }
    }

    @PostMapping("/")
    public ApiResponse<Users> createUser(@RequestBody Users user) {
        return ApiResponse.setSuccessCreatedResponse(userService.createUser(user));
    }

    @PutMapping("/{id}")
    public ApiResponse<Users> updateUser(@PathVariable Long id, @RequestBody Users user) {
        user.setId(id);
        return ApiResponse.setSuccessOkResponse(userService.updateUser(user));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ApiResponse.setSuccessOkResponse(null);
    }
}

