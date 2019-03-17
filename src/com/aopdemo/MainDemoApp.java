package com.aopdemo;

import com.aopdemo.dao.AccountDAO;
import com.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 8e3Yn4uK on 13.03.2019
 */

public class MainDemoApp {
    public static void main(String[] args) {

        // read the spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from the spring container
        AccountDAO theAccountDao = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO theMembershipDao = context.getBean("membershipDAO", MembershipDAO.class);

        // call the business method
        Account myAccount = new Account();
        theAccountDao.addAccount(myAccount, true);
        theMembershipDao.addAccount();

        // close the context
        context.close();
    }
}
