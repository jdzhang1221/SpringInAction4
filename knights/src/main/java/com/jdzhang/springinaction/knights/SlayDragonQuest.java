/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.jdzhang.springinaction.knights;

import java.io.PrintStream;

/**
 * @author zhangjundong
 * @date 2019/7/269:42
 *
 * slay 诛戮
 * dragon 龙
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream){
        this.stream=stream;
    }

    public void embark() {
        stream.println("Embarking on quest to slay the dragon");
    }
}
