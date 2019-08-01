/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.springinaction.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangjundong
 * @date 2019/8/119:56
 */
@Configuration
public class MagicConfig {
    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean(){
        return new MagicBean();
    }
}
