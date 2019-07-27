/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.jdzhang.springinaction.knights;

/**
 * @author zhangjundong
 * @date 2019/7/260:12
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest){
        //Quest被注入进来
        this.quest=quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
