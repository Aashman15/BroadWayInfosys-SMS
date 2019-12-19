package com.test.service;

import com.test.model.User;

public interface UserDao {
     boolean addUser(User u);
     boolean logIn(String userName, String password);
}
