package com.spring.project.storage;

import com.spring.project.model.User;

import java.util.List;

public class UsersStore {
    List<User> users;

    public UsersStore(List<User> users) {
        this.users = users;
    }
}
