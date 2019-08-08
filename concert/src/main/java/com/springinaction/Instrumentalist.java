/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.springinaction;

/**
 * @author zhangjundong
 * @date 2019/8/811:30
 */
public class Instrumentalist implements Performer {
    public void perform() {
        instrument.play();
    }

    private Instrument instrument;

    public void setInstrument(Instrument instrument){
        this.instrument=instrument;
    }

    public Instrument getInstrument(){
        return instrument;
    }
}
