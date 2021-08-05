package com.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateConverter implements Converter<String, Date> {
    private String pattern;

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * convert方法作用：String-->Date
     *                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-DD");
     *                Date date = sdf.parse(source);
     * @param s:代表的是配置文件中 日期字符串 <value>2020-10-02</value>
     * @return:当把转换好的Date作为convert方法的返回值后，Spring自动为birth属性进行注入
     */
    @Override
    public Date convert(String s) {
        Date date = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            date = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
