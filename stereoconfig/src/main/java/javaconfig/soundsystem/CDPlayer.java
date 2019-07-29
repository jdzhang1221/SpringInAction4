/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package javaconfig.soundsystem;

/**
 * @author zhangjundong
 * @date 2019/7/2910:46
 */
public class CDPlayer implements MediaPlayer {

    public CompactDisc cd;

    public CDPlayer(CompactDisc cd){
        this.cd=cd;
    }

    public void play() {
        cd.play();
    }
}
