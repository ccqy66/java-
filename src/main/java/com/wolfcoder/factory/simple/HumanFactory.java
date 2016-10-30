package com.wolfcoder.factory.simple;

/**
 * Created by Administrator on 2016/10/29.
 */
public class HumanFactory {
    public static <T extends Human> T createHuman(Class<T> clz){
        Human human = null;
        try {
            human = (Human) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
