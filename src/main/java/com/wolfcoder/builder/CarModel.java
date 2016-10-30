package com.wolfcoder.builder;

import java.util.List;

/**
 * Created by Administrator on 2016/10/30.
 */
public abstract class CarModel {
    private List<String> sequence = null;
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void enginerBoom();

    public final void run(){
        if (sequence == null) {
            return;
        }
        for (String item : sequence) {
            if (item.equalsIgnoreCase("start")) {
                this.start();
            }else if (item.equalsIgnoreCase("stop")) {
                this.stop();
            }else if (item.equalsIgnoreCase("alarm")) {
                this.alarm();
            }else {
                this.enginerBoom();
            }
        }
    }
    public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
