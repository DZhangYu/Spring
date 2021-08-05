package com.spring;

public class UserDaoImpl implements UserDao{

    @Override
    public void save(User user) {
        System.out.println("insert into user" + user);
    }

    @Override
    public void login(String name, String pwd) {
        System.out.println("login...." + name);
    }
}
