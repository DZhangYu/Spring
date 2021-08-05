package com.proxy;

public class OrderServiceImpl implements OrderService{

    @Override
    public void showOrder() {
        System.out.println("show order");
        throw new RuntimeException("超时........");
    }
}
