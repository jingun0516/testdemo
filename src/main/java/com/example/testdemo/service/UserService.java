package com.example.testdemo.service;

import com.example.testdemo.entity.User;
import org.springframework.transaction.annotation.Transactional;

public interface UserService {
    User login(String loginId, String password);

    User getById(Long id);

    User insert(User user);

    User update(Long id, User originUser);

    @Transactional
    User delete(Long id);
}
