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
 * @date 2019/7/2910:41
 */
public class SgtPeppers implements CompactDisc {
    private String title="Sgt. Pepper's Lonely Hearts Club Band";
    private String artist="The Beatles";

    public void play() {
        System.out.println("Playing "+title+" by "+artist);
    }
}