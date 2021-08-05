package com.spring;

public interface UserService {
    void register(User user);
    void login(String name, String pwd);
}
