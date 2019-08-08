/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.springinaction;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author zhangjundong
 * @date 2019/8/811:37
 */
@Aspect
public class Audience {

    @Pointcut("execution(* com.springinaction.Performer.perform(..))")
    public void performance(){

    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("The audience is taking their seats.");
    }

    @Before("performance()")
    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cellphones");
    }

    @AfterReturning("performance()")
    public void applaud() {
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Boo! We want our money back!");
    }

    @Around("performance()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("before around ====");
        try {
            proceedingJoinPoint.proceed();
            System.out.println("after around ===");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}
