/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package mixedconfig.soundsystem;

import java.util.List;

/**
 * @author zhangjundong
 * @date 2019/7/2916:28
 */
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title,String artist,List<String> tracks){
        this.title=title;
        this.artist=artist;
        this.tracks=tracks;
    }

    public void play() {
        System.out.println("Playing "+title+" by "+artist);
        for (String track : tracks){
            System.out.println("-Track: "+track);
        }
    }
}
