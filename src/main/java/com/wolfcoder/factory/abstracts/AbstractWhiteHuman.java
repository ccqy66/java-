package com.wolfcoder.factory.abstracts;


/**
 * Created by Administrator on 2016/10/29.
 */
public abstract class AbstractWhiteHuman implements Human{
    public String getColor() {
        return "white";
    }

    public void talk() {
        System.out.println("white talk");
    }
}
