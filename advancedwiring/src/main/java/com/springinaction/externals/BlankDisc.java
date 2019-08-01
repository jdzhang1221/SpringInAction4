/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.springinaction.externals;

/**
 * @author zhangjundong
 * @date 2019/8/121:52
 */

public class BlankDisc {

    private final  String title;
    private final String artist;

    public BlankDisc(String title,String artist){
        this.title=title;
        this.artist=artist;
    }

    public  String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }
}
