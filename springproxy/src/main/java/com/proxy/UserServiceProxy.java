package com.proxy;

public class UserServiceProxy implements UserService{
    private UserServiceImpl userService = new UserServiceImpl();

    @Override
    public void login(User user) {
        System.out.println("------log-----");
        userService.login(user);
    }

    @Override
    public void regist(String name, String password) {
        System.out.println("-----log-----");
        userService.regist(name, password);
    }
}
