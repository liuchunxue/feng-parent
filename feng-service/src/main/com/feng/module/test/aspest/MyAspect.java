package com.feng.module.test.aspest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 第一个表示匹配任意的方法返回值， …(两个点)表示零个或多个，第一个…表示service包及其子包,第二个表示所有类, 第三个*表示所有方法，第二个…表示方法的任意参数个数
 * 定义在pointcutexp包和所有子包里的JoinPointObjP2类的任意方法的执行：execution(*com.test.spring.aop.pointcutexp..JoinPointObjP2.*(..))")
 * pointcutexp包里的任意类： within(com.test.spring.aop.pointcutexp.*)
 * pointcutexp包和所有子包里的任意类：within(com.test.spring.aop.pointcutexp..*)
 * 实现了Intf接口的所有类,如果Intf不是接口,限定Intf单个类：this(com.test.spring.aop.pointcutexp.Intf)
 * 当一个实现了接口的类被AOP的时候,用getBean方法必须cast为接口类型,不能为该类的类型
 * 带有@Transactional标注的所有类的任意方法： @within(org.springframework.transaction.annotation.Transactional) @target(org.springframework.transaction.annotation.Transactional)
 * 带有@Transactional标注的任意方法：
 *
 * @annotation(org.springframework.transaction.annotation.Transactional)
 * @within和@target针对类的注解,@annotation是针对方法的注解 参数带有@Transactional标注的方法：@args(org.springframework.transaction.annotation.Transactional)
 * 参数为String类型(运行是决定)的方法： args(String)
 **/
@Component
@Aspect
public class MyAspect {
    private static final Logger logger = LoggerFactory.getLogger(MyAspect.class);

    /**
     * 匹配模式拦截，拦截save开头的所有方法
     */
    @Pointcut(value = "execution(* com.feng.module.*.save*(..))")
    @Order(1) //存在多个拦截的时候，定义执行顺序额
    public void scan() {

    }

    /**
     * @annotation 标识拦截指定的注解
     */
    @Pointcut(value = "@annotation(com.feng.module.test.aspest.AopPoint)")
    public void annotation() {
    }

    /**
     * 指定拦截AopPoint
     */
    @Before("@annotation(aopPoint)")
    public void before(JoinPoint joinPoint, AopPoint aopPoint) {
        Object[] o = joinPoint.getArgs();
        if (o != null) {
            for (int i = 0; i < o.length; i++) {
                logger.info("---Before----{}", o[i]);
                logger.info("---Before----{}", aopPoint.value());
            }
        }
    }

    @After("@annotation(aopPoint)")
    public void after(JoinPoint joinPoint, AopPoint aopPoint) {
        Object[] o = joinPoint.getArgs();
        if (o != null) {
            for (int i = 0; i < o.length; i++) {
                logger.info("---After----{}", o[i]);
            }
        }
    }

    @Around("@annotation(aopPoint)")
    public void around(JoinPoint joinPoint, AopPoint aopPoint) {
        Object[] o = joinPoint.getArgs();
        if (o != null) {
            for (int i = 0; i < o.length; i++) {
                logger.info("---Around----{}", o[i]);
            }
        }
    }
}
