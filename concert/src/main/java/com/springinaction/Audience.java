/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.springinaction;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author zhangjundong
 * @date 2019/8/720:49
 */
@Aspect
public class Audience {

    @Pointcut("execution(* com.springinaction.Performance.perform(..))")
    public void performance() {
        System.out.println("我想睡觉");
    }

    @Before("performance()")
    public void takeSeats(){
        System.out.println("take seats");
    }

    @Before("performance()")
    public void silenceCellPhone(){
        System.out.println("Silencing cell phone");
    }

    @Before("performance()")
    public void applaud(){
        System.out.println("CLAP CLAP CLAP!");
    }

    @Before("performance()")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }


}
