package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by 8e3Yn4uK on 13.03.2019
 */

@Aspect
@Component
public class MyDemoLoggingAspect {

    @Pointcut("execution(* com.aopdemo.dao.*.*(..))")
    private void forDAOPackage() {}

    @Pointcut("execution(* com.aopdemo.dao.*.get*(..))")
    private void getter() {}

    @Pointcut("execution(* com.aopdemo.dao.*.set*(..))")
    private void setter() {}

    @Pointcut("forDAOPackage() && !(getter() || setter())")
    private void forDaoPackageNoGetterSetter() {}

    @Before("forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(){

        System.out.println("\n Executing @Before advice");
    }

    @Before("forDAOPackage()")
    public void performApiAnalitics(){

        System.out.println("\n Performing API Analitics");
    }
}
