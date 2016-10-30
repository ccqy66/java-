package com.wolfcoder.builder;

/**
 * Created by Administrator on 2016/10/30.
 */
public class BMWModel extends CarModel{
    protected void start() {
        System.out.println("BMWModel start");
    }

    protected void stop() {
        System.out.println("BMWModel stop");
    }

    protected void alarm() {
        System.out.println("BMWModel alarm");
    }

    protected void enginerBoom() {
        System.out.println("BMWModel enginerBoom");
    }
}
