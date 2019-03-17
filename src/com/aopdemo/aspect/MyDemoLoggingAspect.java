package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by 8e3Yn4uK on 13.03.2019
 */

@Aspect
@Component
public class MyDemoLoggingAspect {

    @Before("execution(* com.aopdemo.dao.*.*(..))")
    public void beforeAddAccountAdvice(){

        System.out.println("\n Executing @Before advice");
    }
}
