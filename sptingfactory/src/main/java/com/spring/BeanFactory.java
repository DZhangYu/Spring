package com.spring;

import java.io.InputStream;
import java.util.Properties;

public class BeanFactory {

    private static Properties env = new Properties();

    //静态代码块
    static {
        try {
            //第一步，获得IO流
            InputStream inputStream = BeanFactory.class.getResourceAsStream("/applicationContext.properties");
            //第二步，文件内容，封装 Properties集合中，key = userService, value = com.spring.UserServiceImpl
            env.load(inputStream);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 对象的创建方式：
     * 1、直接调用构造方法，创建对象： UserService userService = new UserServiceImpl();
     * 2、通过反射的形式，创建对象，解耦合
     *      Class clazz = Class.forName("com.spring.UserServiceImpl");
     *      UserService userService = (UserService)clazz.newInstance();
     */
    public static UserService getUserService() {
        UserService userService = null;
        try {
            Class clazz = Class.forName(env.getProperty("userService"));
            userService= (UserService)clazz.newInstance();
        } catch (Exception e){
            e.printStackTrace();
        }

        return userService;
    }

    public static UserDao getUserDao() {
        UserDao userDao = null;
        try {
            Class clazz = Class.forName(env.getProperty("userDao"));
            userDao = (UserDao) clazz.newInstance();
        } catch (Exception e){
            e.printStackTrace();
        }
        return userDao;
    }

    /**
     * 通用工厂
     * @param key
     * @return
     */
    public static Object getBean(String key) {
        Object obj = null;
        try {
            Class clazz = Class.forName(env.getProperty(key));
            obj = clazz.newInstance();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
