package com.wolfcoder.factory.simple;

/**
 * Created by Administrator on 2016/10/29.
 */
public class BlackHuman implements Human{
    public String getColor() {
        return "black";
    }

    public void talk() {
        System.out.println("talk to others");
    }
}
