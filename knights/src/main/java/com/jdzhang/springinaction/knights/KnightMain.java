/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.jdzhang.springinaction.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangjundong
 * @date 2019/7/2712:58
 */
public class KnightMain {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("knights.xml");
        Knight knight=context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
