/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package javaconfig.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangjundong
 * @date 2019/7/2910:49
 */
@Configuration
public class CDPlayerConfig {

    @Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }

    @Bean
    public MediaPlayer mediaPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }
}
