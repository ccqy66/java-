package com.wolfcoder.builder;

/**
 * Created by Administrator on 2016/10/30.
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        director.getCBMWModel().run();
    }
}
