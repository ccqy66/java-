package com.wolfcoder.proxy;

/**
 * Created by Administrator on 2016/10/31.
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("chenchen");
        IGamePlayer proxy = new GamePlayerProxy(gamePlayer);
        proxy.login("chenchen","wsmwdai");
        proxy.killBoss();
        proxy.upgrade();
    }
}
