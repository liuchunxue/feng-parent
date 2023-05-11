package com.feng.module.test.aspest;

import java.lang.annotation.*;

/**
 * @ClassNameaopPoint
 * @Description
 * @Author liucx
 * @Date2020/9/17 20:25
 **/

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface
AopPoint {
    String value();
}
