package com.wolfcoder.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/30.
 */
public class Director {
    private CarBuilder benBuilder = new BenzBuilder();
    private CarBuilder bmwBuilder = new BMWBuilder();
    private List<String> sequence = new ArrayList<String>();

    /**
     * A类型的奔驰车模型，先start，然后stop，其他什么引擎都没有。
     * @return
     */
    public BenzModel getABenzModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benBuilder.setSequence(this.sequence);
        return (BenzModel) this.benBuilder.getCarModel();
    }

    /**
     * B类型的宝马车是先发动引擎，然后启动，再停止
     * @return
     */
    public BenzModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add("enginerBoom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benBuilder.setSequence(this.sequence);
        return (BenzModel) this.benBuilder.getCarModel();
    }

    /**
     * C类型的宝马车是先按下喇叭，然后启动，再停止
     * @return
     */
    public BMWModel getCBMWModel() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }

    /**
     * D类型的宝马车只有一个功能，就是跑。
     * @return
     */
    public BMWModel getDBMWzModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }
}
