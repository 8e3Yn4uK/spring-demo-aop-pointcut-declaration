package com.aopdemo.dao;

import com.aopdemo.Account;
import org.springframework.stereotype.Component;

/**
 * Created by 8e3Yn4uK on 13.03.2019
 */

@Component
public class AccountDAO {

    public void addAccount(Account theAccount, boolean vipFlag){
        System.out.println("\n" + getClass() + ": Doing my DB work - adding account");
    }
}
