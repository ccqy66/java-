package com.wolfcoder.builder;

import java.util.List;

/**
 * Created by Administrator on 2016/10/30.
 */
public class BenzBuilder extends CarBuilder{
    private CarModel carModel = new BenzModel();
    public void setSequence(List<String> sequence) {
        this.carModel.setSequence(sequence);
    }

    public CarModel getCarModel() {
        return this.carModel;
    }
}
