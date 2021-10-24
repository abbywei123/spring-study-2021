package com.yw.anno;

//使用注解方式实现AOP

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect //标注这个类是切面
public class AnnotationPointCut {

    @Before("execution(* com.yw.service.USerServiceImpl.*(..))")
    public void before(){
        System.out.println("=========方法执行前=======");
    }

    @After("execution(* com.yw.service.USerServiceImpl.*(..))")
    public void after(){
        System.out.println("=========方法执行后=======");
    }

    //在环绕增强中，我们可以给定一个参数，代表我们需要获取处理切入的点
    @Around("execution(* com.yw.service.USerServiceImpl.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前");
        //执行方法
        System.out.println(proceedingJoinPoint.getSignature());
        Object proceed=proceedingJoinPoint.proceed();
        System.out.println("proceed:"+proceed);
        System.out.println("环绕后");
    }
}
