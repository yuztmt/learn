package com.example.learn.serviceimpl;

import com.example.learn.api.User;
import com.example.learn.api.service.UserService;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class UserServiceImpl implements UserService{
    @Override
    public User getUser(Integer id) {
        return new User(1, "one","yu","a123");
    }
}
