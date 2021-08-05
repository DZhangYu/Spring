package com;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Target:该注解应用在哪
 *         ElementType.METHOD--->方法
 *         ElementType.PACKAGE--->包
 * @Retention:该注解在哪起作用
 *         一般参数写死为RetentionPolicy.RUNTIME
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Log {

}
