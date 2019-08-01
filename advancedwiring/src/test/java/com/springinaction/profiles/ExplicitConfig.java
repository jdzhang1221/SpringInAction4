/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.springinaction.profiles;

import com.springinaction.scopedbeans.Notepad;
import com.springinaction.scopedbeans.UniqueThing;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author zhangjundong
 * @date 2019/8/120:32
 */
@Configuration
public class ExplicitConfig {
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Notepad notepad(){
        return new Notepad();
    }

    @Bean
    public UniqueThing unique(){
        return new UniqueThing();
    }
}
