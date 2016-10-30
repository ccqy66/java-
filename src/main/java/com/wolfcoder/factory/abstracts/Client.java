package com.wolfcoder.factory.abstracts;

/**
 * Created by Administrator on 2016/10/29.
 */
public class Client {
    public static void main(String[] args) {
        HumanFactory maleFactory = new MaleFactory();
        MaleBlackHuman maleBlackHuman = (MaleBlackHuman) maleFactory.createBlackHuman();
        System.out.println(maleBlackHuman.getColor()+" "+maleBlackHuman.getSex()+" ");
    }
}
