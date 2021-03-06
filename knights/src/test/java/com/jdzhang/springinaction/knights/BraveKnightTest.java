/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.jdzhang.springinaction.knights;

import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * @author zhangjundong
 * @date 2019/7/260:19
 *
 * brave 勇敢
 * knight 骑士
 * embark 从事
 * quest 探索
 */
public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest(){
        //创建Mock Quest
        Quest mockQuest=mock(Quest.class);
        //注入 mock Quest
        BraveKnight knight=new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}
