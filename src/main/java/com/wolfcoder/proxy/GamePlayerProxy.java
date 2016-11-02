package com.wolfcoder.proxy;

/**
 * Created by Administrator on 2016/10/31.
 */
public class GamePlayerProxy implements IGamePlayer{
    private IGamePlayer target;

    public GamePlayerProxy(IGamePlayer target) {
        this.target = target;
    }
    public void login(String user, String password) {
        this.target.login(user,password);
    }

    public void killBoss() {
        this.target.killBoss();
    }

    public void upgrade() {
        this.target.upgrade();
    }
}
