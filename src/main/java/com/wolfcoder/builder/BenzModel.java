package com.wolfcoder.builder;

/**
 * Created by Administrator on 2016/10/30.
 */
public class BenzModel extends CarModel{
    protected void start() {
        System.out.println("BenzModel start");
    }

    protected void stop() {
        System.out.println("BenzModel stop");
    }

    protected void alarm() {
        System.out.println("BenzModel alarm");
    }

    protected void enginerBoom() {
        System.out.println("BenzModel enginerBoom");
    }
}
