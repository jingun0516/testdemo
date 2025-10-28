package com.example.testdemo.service;

import com.example.testdemo.entity.User;

public interface UserService {
    User login(String loginId, String password);
    User getById(Long id);
    User save(User user);
    User update(Long id, User newUser);
    void delete(Long id);
}
