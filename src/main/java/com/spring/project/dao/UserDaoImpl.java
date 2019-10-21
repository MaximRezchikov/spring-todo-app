package com.spring.project.dao;

import com.spring.project.model.Task;
import com.spring.project.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    static List<User> users = new ArrayList<>();

    public static User createUser() {
        User testUser = new User(1L, "test@email.com", "pass", "testName", "testLastName");
        users.add(testUser);
        User user = users.get(1);
        return user;
    }

    @Override
    public User add(User user) {
        users.add(user);
        return users.get(1);
    }

    @Override
    public User findById(Long id) {
        return users.get(id.intValue());
    }

    @Override
    public User update(Long id) {
        users.set(id.intValue(), new User(1L, "test@email2.com", "pass2", "testName2", "testLastName2"));
        return users.get(id.intValue());
    }

    @Override
    public void deleteById(Long id) {
        users.remove(id.intValue());
    }
}
