/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package xmlconfig.soundsystem.properties;

import org.springframework.beans.factory.annotation.Autowired;
import xmlconfig.soundsystem.CompactDisc;
import xmlconfig.soundsystem.MediaPlayer;

/**
 * @author zhangjundong
 * @date 2019/7/2914:34
 */
public class CDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    @Autowired
    public void setCompactDisc(CompactDisc compactDisc){
        this.compactDisc=compactDisc;
    }

    public void play() {
        compactDisc.play();
    }
}
