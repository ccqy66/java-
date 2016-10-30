package com.wolfcoder.factory.factorymethod;

/**
 * Created by Administrator on 2016/10/29.
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        product.abstractMethod();
    }
}
