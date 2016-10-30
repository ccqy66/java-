package com.wolfcoder.factory.abstracts;

/**
 * Created by Administrator on 2016/10/29.
 */
public class FemaleFactory implements HumanFactory{
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }
}
