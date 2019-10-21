package com.spring.project.service;

import com.spring.project.dao.UserDao;
import com.spring.project.dao.UserDaoImpl;
import com.spring.project.model.Task;
import com.spring.project.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();

    @Override
    public User signUp(User user) {
        return null;
    }

    @Override
    public User signIn(User user) {
        return null;
    }
}
