/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package xmlconfig.soundsystem.properties;

import xmlconfig.soundsystem.CompactDisc;

import java.util.List;

/**
 * @author zhangjundong
 * @date 2019/7/2914:36
 */
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    public void setTitle(String title){
        this.title=title;
    }

    public void setArtist(String artist){
        this.artist=artist;
    }

    public void setTracks(List<String> tracks){
        this.tracks=tracks;
    }

    public void play() {
        System.out.println("Playing "+title+" by "+artist);
        for (String track : tracks){
            System.out.println("-Track: "+track);
        }
    }
}
