package com.proxy;

import com.Log;

public class UserServiceImpl implements UserService{
    /**
     * @Log-->自定义注解
     * @param user
     */
    @Log
    @Override
    public void login(User user) {
        System.out.println("UserServiceImpl.login");
    }

    @Override
    public void regist(String name, String password) {
        System.out.println("UserServiceImpl.regist");
    }
}
