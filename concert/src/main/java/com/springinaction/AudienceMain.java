/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.springinaction;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhangjundong
 * @date 2019/8/721:11
 */
public class AudienceMain {

    public static void main(String[] args){
        ApplicationContext ctx=new AnnotationConfigApplicationContext();
        ((AnnotationConfigApplicationContext) ctx).register(ConcertConfig.class);
        ((AnnotationConfigApplicationContext) ctx).refresh();

         Audience audience=(Audience)ctx.getBean("audience");
         audience.performance();
         ((AnnotationConfigApplicationContext) ctx).close();
    }
}
