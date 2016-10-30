package com.wolfcoder.factory.factorymethod;

/**
 * Created by Administrator on 2016/10/29.
 */
public abstract class Creator {
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
