package com.ilyabogatskiy.spring_js.service;

import com.ilyabogatskiy.spring_js.model.User;

import java.util.Optional;

public interface UserService {
    void createNewUser(User user);
    void deleteUser(long id);
    void updateUser(User user);
    Optional<User> findUserById(Long id);
    Iterable<User> getAllUsers();
}
