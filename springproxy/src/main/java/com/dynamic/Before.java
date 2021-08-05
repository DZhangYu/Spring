package com.dynamic;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Before implements MethodBeforeAdvice {

    /**
     *
     * @param method:额外功能所增加给的那个原始方法
     * @param objects: 额外功能所增加给的那个原始方法的参数
     * @param o:额外功能所增加给的那个原始对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("-----log-----");
    }
}
