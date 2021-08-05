package com.factorybean;

import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactoryBean implements FactoryBean {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 创建复杂对象
     * @return
     * @throws Exception
     */
    @Override
    public Object getObject() throws Exception {
        Class.forName(driverClassName);
        Connection conn = DriverManager.getConnection(url,username, password);
        return conn;
    }

    /**
     * 返回复杂对象类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Connection.class;
    }

    /**
     * 返回是否单例
     * @return
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
