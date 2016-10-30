package com.wolfcoder.template;

/**
 * Created by Administrator on 2016/10/30.
 */
public class HummerH1Model extends AbstractHummerModel{
    protected void strat() {
        System.out.println("HummerH1Model start");
    }

    protected void stop() {
        System.out.println("HummerH1Model stop");
    }

    protected void alarm() {
        System.out.println("HummerH1Model alarm");
    }

    protected void enginerBoom() {
        System.out.println("HummerH1Model enginerBoom");
    }
}
