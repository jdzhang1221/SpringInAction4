/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package mixedconfig.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangjundong
 * @date 2019/7/2916:05
 */
@Configuration
public class CDConfig {
    @Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }
}
