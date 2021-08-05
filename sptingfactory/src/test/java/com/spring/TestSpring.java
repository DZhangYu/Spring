package com.spring;

import com.beanpost.Category;
import com.scope.Account;
import com.spring.constructor.Customer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class TestSpring {
    @Test
    public void test(){
        UserService userService = (UserService) BeanFactory.getBean("userService");
        //耦合
        //UserService userService = new UserServiceImpl();
        userService.login("zhangsan", "123");
        User user = new User("zhangsan",123);
        userService.register(user);
    }

    /**
     * 用于测试:Spring的第一个程序
     */
    @Test
    public void test2(){
        //1、获得Spring工厂
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        //2、通过工厂类获得对象
        //  三种重载方法
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
        //以下两种重载方式，在当前Spring的配置文件中，只能有一个bean class是Person的类型
        Person person1 = ctx.getBean("person", Person.class);
        Person person2 = ctx.getBean(Person.class);

        //获取的是 Spring工厂配置文件中所有bean标签的id值 person
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionname : beanDefinitionNames){
            System.out.println(beanDefinitionname);
        }

        //根据类型获得Spring配置文件中对应的id值
        String[] beanNamesForType = ctx.getBeanNamesForType(Person.class);
        for (String id : beanNamesForType){
            System.out.println(id);
        }

        //用于判断是否存在指定id值的bean
        if (ctx.containsBeanDefinition("a"))
            System.out.println(true);
        else
            System.out.println(false);
        //用于判断是否存在指定id、name的bean
        if (ctx.containsBean("a"))
            System.out.println(true);
        else
            System.out.println(false);
    }

    @Test
    public void test3(){
        //1、获得Spring工厂
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        //获取的是 Spring工厂配置文件中所有bean标签的id值 person
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionname : beanDefinitionNames){
            System.out.println(beanDefinitionname);
        }
    }

    @Test
    public void test4(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        User uu = (User) ctx.getBean("uu");
        System.out.println("uu = " + uu);
    }

    @Test
    public void test5(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println("person = " + person);
    }

    @Test
    public void test6(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService1");
        User user = (User) ctx.getBean("user");
        userService.register(user);
        userService.login("zhangs", "123123");
    }

    @Test
    public void test7(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Customer customer = (Customer) ctx.getBean("customer1");
        System.out.println("customer = " + customer);
    }

    @Test
    public void test8(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Connection conn = (Connection) ctx.getBean("conn");
        System.out.println("conn = " + conn);
    }

    @Test
    public void test9(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Connection conn = (Connection) ctx.getBean("conn1");
        Connection conn1 =  (Connection) ctx.getBean("conn1");
        System.out.println("conn = " + conn);
        System.out.println("conn1 = " + conn1);
    }

    /**
     * 简单对象的创建次数：
     * scope属性:
     *  singleton:只会创建一次简单对象
     *  prototype:每一次都会创建新的对象
     *  默认:singleton
     *
     */
    @Test
    public void test10(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Account acct1 = (Account) ctx.getBean("account");
        Account acct2 = (Account) ctx.getBean("account");
        System.out.println("acct1 = " + acct1);
        System.out.println("acct2 = " + acct2);
        Account acct11 = (Account) ctx.getBean("account1");
        Account acct22 = (Account) ctx.getBean("account1");
        System.out.println("acct11 = " + acct11);
        System.out.println("acct22 = " + acct22);
    }

    /**
     * 演示生命周期
     */
    @Test
    public void test11(){
/*        //创建工厂
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        //创建对象
        ctx.getBean("product");*/

        //创建工厂
        ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("/applicationContext.xml");
        //创建对象
        ctx1.getBean("product");
        ctx1.close();
    }

    @Test
    public void test12(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext1.xml");
        Connection conn = (Connection) ctx.getBean("conn");
        System.out.println("conn = " + conn);
    }

    @Test
    public void test13(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext1.xml");
        com.converter.Person person = (com.converter.Person) ctx.getBean("person");
        System.out.println("person = " + person);
    }
    
    @Test
    public void test14(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext3.xml");
        Category ct = (Category) ctx.getBean("c");
        System.out.println("ct.getName() = " + ct.getName());
        
    }

}
