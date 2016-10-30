package com.wolfcoder.template;

/**
 * Created by Administrator on 2016/10/30.
 */
public abstract class AbstractHummerModel {
    protected abstract void strat();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void enginerBoom();
    public final void run() {
        this.strat();
        this.enginerBoom();
        this.alarm();
        this.stop();
    }
}
