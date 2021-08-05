package com.spring;

public interface UserDao {
    void save(User user);
    void login(String name, String pwd);
}
