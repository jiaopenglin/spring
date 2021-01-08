package com.spring.ioc.aop;

import org.springframework.aop.MethodBeforeAdvice;
import java.lang.reflect.Method;

public class MYAop implements MethodBeforeAdvice {


    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行方法前");
    }
}


