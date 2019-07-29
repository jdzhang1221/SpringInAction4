/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package xmlconfig.soundsystem;

/**
 * @author zhangjundong
 * @date 2019/7/2914:03
 */
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;

    public BlankDisc(String title,String artist){
        this.title=title;
        this.artist=artist;
    }

    public void play() {
        System.out.println("Playing "+title+" by "+artist);
    }
}
