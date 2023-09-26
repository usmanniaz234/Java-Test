package com.example.Service;

import com.example.Model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
