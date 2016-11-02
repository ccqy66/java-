package com.wolfcoder.prototype;

/**
 * Created by Administrator on 2016/11/2.
 */
public class PrototypeClass implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        PrototypeClass prototypeClass = null;
        prototypeClass = (PrototypeClass) super.clone();
        return prototypeClass;
    }
}
