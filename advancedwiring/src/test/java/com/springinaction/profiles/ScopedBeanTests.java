/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.springinaction.profiles;

import com.springinaction.scopedbeans.Notepad;
import com.springinaction.scopedbeans.UniqueThing;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

/**
 * @author zhangjundong
 * @date 2019/8/120:44
 */
public class ScopedBeanTests {

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes = ComponentScannedConfig.class)
    public static class ComponentScannedScopedBeanTest{

        @Autowired
        private ApplicationContext context;

        @Test
        public void testProxyScope(){
            Notepad notepad1=context.getBean(Notepad.class);
            Notepad notepad2=context.getBean(Notepad.class);
            assertNotSame(notepad1,notepad2);
        }

        @Test
        public void testSingletonScope(){
            UniqueThing thing1=context.getBean(UniqueThing.class);
            UniqueThing thing2=context.getBean(UniqueThing.class);
            assertSame(thing1,thing2);
        }
    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes = ExplicitConfig.class)
    public static class ExplicitConfigScopeBeanTest{

        @Autowired
        private ApplicationContext context;

        @Test
        public void testProxyScope(){
            Notepad notepad1=context.getBean(Notepad.class);
            Notepad notepad2=context.getBean(Notepad.class);
            assertNotSame(notepad1,notepad2);
        }

        @Test
        public void testSingletonScope(){
            UniqueThing thing1=context.getBean(UniqueThing.class);
            UniqueThing thing2=context.getBean(UniqueThing.class);
            assertSame(thing1,thing2);
        }
    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("classpath:scoped-beans.xml")
    public static class XMLConfigScopeBeanTest{

        @Autowired
        private ApplicationContext context;

        @Test
        public void testProxyScope(){
            Notepad notepad1=context.getBean(Notepad.class);
            Notepad notepad2=context.getBean(Notepad.class);
            assertNotSame(notepad1,notepad2);
        }

        @Test
        public void testSingletonScope(){
            UniqueThing thing1=context.getBean(UniqueThing.class);
            UniqueThing thing2=context.getBean(UniqueThing.class);
            assertSame(thing1,thing2);
        }
    }
}
