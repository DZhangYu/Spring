package com.dynamic;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Arround implements MethodInterceptor {
    /**
     * invoke方法的作用：额外功能书写在invoke里面
     *                 额外功能  原始方法之前
     *                          原始方法之后
     *                          原始方法之前  之后
     * @param methodInvocation : 额外功能所增加给的那个原始方法
     *                         login()  register()
     * @return object
     *          原始方法执行后的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        //原始方法的执行方法,可以加在该方法的任意地方,同时也可以进行强制修改原始方法返回值
        Object ret = null;
        try {
            System.out.println("------之前-----");
            ret = methodInvocation.proceed();
            System.out.println("------之后----");
        } catch (Throwable throwable) {
            System.out.println("抛异常" + throwable.getMessage());
        }
        return ret;
    }
}
