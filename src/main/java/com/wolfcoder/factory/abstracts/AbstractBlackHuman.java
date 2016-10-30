package com.wolfcoder.factory.abstracts;

/**
 * Created by Administrator on 2016/10/29.
 */
public abstract class AbstractBlackHuman implements Human{
    public String getColor() {
        return "black";
    }

    public void talk() {
        System.out.println("black talk");
    }
}
