package com.example.testdemo.service.impl;

import com.example.testdemo.entity.User;
import com.example.testdemo.repository.UserRepository;
import com.example.testdemo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long> implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
    }

    @Override
    public User login(String loginId, String password) {
        User user = userRepository.findByLoginId(loginId);
        if (user == null) {
            return null;
        }

        if (!user.getPassword().equals(password)) {
            return null;
        }

        return user;
    }

    @Override
    public User update(Long id, User newUser) {
        User user = getById(id);

        if(newUser.getName() != null) {
            user.setName(newUser.getName());
        }
        if(newUser.getEmail() != null) {
            user.setEmail(newUser.getEmail());
        }
        if(newUser.getPassword() != null) {
            user.setPassword(newUser.getPassword());
        }
        return super.save(user);
    }
}
