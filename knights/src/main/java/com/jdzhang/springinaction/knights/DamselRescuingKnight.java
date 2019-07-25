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
 * @date 2019/7/260:00
 */
public class DamselRescuingKnight implements Knight {

    private RescueDamselQuest rescueDamselQuest;

    public DamselRescuingKnight(){
        this.rescueDamselQuest=new RescueDamselQuest();
    }

    public void embarkOnQuest() {
        rescueDamselQuest.embark();
    }
}
