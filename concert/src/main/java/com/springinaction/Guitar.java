/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.springinaction;

import org.springframework.stereotype.Component;

/**
 * @author zhangjundong
 * @date 2019/8/811:35
 */
@Component
public class Guitar implements Instrument {

    public void play() {
        System.out.println("Strum strum strum");
    }
}
