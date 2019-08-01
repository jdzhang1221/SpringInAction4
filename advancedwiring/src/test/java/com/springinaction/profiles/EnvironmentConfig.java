/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.springinaction.profiles;

import com.springinaction.externals.BlankDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author zhangjundong
 * @date 2019/8/122:04
 */
@Configuration
@PropertySource("classpath:app.properties")
public class EnvironmentConfig {

    @Autowired
    Environment env;

    @Bean
    public BlankDisc blankDisc(){
        return new BlankDisc(
                env.getProperty("disc.title"),
                env.getProperty("disc.artist")
        );
    }
}
