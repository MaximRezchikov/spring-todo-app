package com.spring.project.service;


import com.spring.project.model.Task;
import com.spring.project.model.User;

import java.util.List;

public interface UserService {
    User signUp(User user);

    User signIn(User user);

}
