package com.wolfcoder.factory.abstracts;

/**
 * Created by Administrator on 2016/10/29.
 */
public class MaleFactory implements HumanFactory{
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }

    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }
}
