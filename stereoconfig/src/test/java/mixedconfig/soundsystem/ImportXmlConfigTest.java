/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package mixedconfig.soundsystem;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * @author zhangjundong
 * @date 2019/7/2916:56
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( classes = SoundSystemConfig.class)
public class ImportXmlConfigTest {
    @Rule
    public final SystemOutRule log=new SystemOutRule().enableLog();

    @Autowired
    private MediaPlayer player;

    @Test
    public void play(){
        player.play();
        assertEquals(
                "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\r\n" +
                        "-Track: Sgt. Pepper's Lonely Hearts Club Band\r\n" +
                        "-Track: With a Little Help from My Friends\r\n" +
                        "-Track: Lucy in the Sky with Diamonds\r\n" +
                        "-Track: Getting Better\r\n" +
                        "-Track: Fixing a Hole\r\n",
                log.getLog());
    }
}
