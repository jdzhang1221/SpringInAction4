/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.springinaction.profiles;

import com.springinaction.externals.BlankDisc;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * @author zhangjundong
 * @date 2019/8/122:16
 */
public class EnvironmentInjectionTest {

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes = EnvironmentConfig.class)
    public static class InjectFromProperties{

        @Autowired
        private BlankDisc blankDisc;

        @Test
        public void assertBlankDiscProperties(){
            assertEquals("The Beatles", blankDisc.getArtist());
            assertEquals("Sgt. Peppers Lonely Hearts Club Band", blankDisc.getTitle());
        }
    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes = EnvironmentConfigWithDefaults.class)
    public static class InjectFromPropertiesWithDefaultValues{

        @Autowired
        private BlankDisc blankDisc;

        @Test
        public void assertBlankDiscProperties(){
            assertEquals("U2",blankDisc.getArtist());
            assertEquals("Rattle and Hum", blankDisc.getTitle());
        }
    }

    public static class InjectFromPropertiesWithRequiredProperties{

        @Test(expected = BeanCreationException.class)
        public void assertBlankDiscProperties(){
            new AnnotationConfigApplicationContext(EnvironmentConfigWithRequiredProperties.class);
        }
    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("classpath:placeholder-config.xml")
    public static class InjectFromProperties_XMLConfig{

        @Autowired
        private BlankDisc blankDisc;

        @Test
        public void assertBlankDiscProperties(){
            assertEquals("The Beatles", blankDisc.getArtist());
            assertEquals("Sgt. Peppers Lonely Hearts Club Band", blankDisc.getTitle());
        }
    }
}
