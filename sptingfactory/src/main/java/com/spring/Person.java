package com.spring;

import java.util.*;

public class Person {
    private String name;
    private Integer age;
    private String[] emails;
    private Set<String> tels;
    private List<String> addres;
    private Map map;
    private Properties properties;
    public Person(String name, Integer age, String[] emails, Set<String> tels) {
        this.name = name;
        this.age = age;
        this.emails = emails;
        this.tels = tels;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", emails=" + Arrays.toString(emails) +
                ", tels=" + tels +
                ", addres=" + addres +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }

    public String[] getEmails() {
        return emails;
    }

    public void setEmails(String[] emails) {
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Set<String> getTels() {
        return tels;
    }

    public void setTels(Set<String> tels) {
        this.tels = tels;
    }

    public List<String> getAddres() {
        return addres;
    }

    public void setAddres(List<String> addres) {
        this.addres = addres;
    }

    public Map getMap() {
        return map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setMap(Map map) {
        this.map = map;
    }
}
