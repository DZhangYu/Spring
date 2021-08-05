package com.life;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Product implements InitializingBean, DisposableBean {
    public Product() {
        System.out.println("Product.Product");
    }

    //初始化方法：做一些初始化操作
    //Spring会进行调用
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化。。。");
    }

    //销毁方法：销毁操作（资源释放的操作）
    @Override
    public void destroy() throws Exception {
        System.out.println("Product.destroy");
    }
}
