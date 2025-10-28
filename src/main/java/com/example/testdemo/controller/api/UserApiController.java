package com.example.testdemo.controller.api;

import com.example.testdemo.entity.User;
import com.example.testdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequiredArgsConstructor
@RestController("/user")
public class UserApiController {

    private final UserService userService;

    @PostMapping("/insert")
    public ResponseEntity<User> insert(@RequestBody User user) {
        User savedUser = userService.insert(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }

    // 로그인
    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody Map<String, String> body) {
        String loginId = body.get("loginId");
        String password = body.get("password");
        User user = userService.login(loginId, password);
        return ResponseEntity.ok(user);
    }

    // 업데이트
    @PutMapping("/{id}")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User newUser) {
        User updatedUser = userService.update(id, newUser);
        return ResponseEntity.ok(updatedUser);
    }

    // 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<User> delete(@PathVariable Long id) {
        User deletedUser = userService.delete(id);
        return ResponseEntity.ok(deletedUser);
    }

}
