package com.wolfcoder.factory.simple;

/**
 * Created by Administrator on 2016/10/29.
 */
public class Client {
    public static void main(String[] args) {
        Human human = HumanFactory.createHuman(BlackHuman.class);
        System.out.println(human.getColor());
    }
}
