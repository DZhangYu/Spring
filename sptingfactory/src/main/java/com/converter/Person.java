package com.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String name;
    private Date brith;

    public Person() {
    }

    public Person(String name, Date brith) {
        this.name = name;
        this.brith = brith;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBrith() {
        return brith;
    }

//    public void setBrith(String brith) {
//        Date date = null;
//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
//            date = sdf.parse(brith);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        this.brith = date;
//    }

    public void setBrith(Date brith) {
        this.brith = brith;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", brith=" + brith +
                '}';
    }
}
