package com.wolfcoder.builder;

import java.util.List;

/**
 * Created by Administrator on 2016/10/30.
 */
public class BMWBuilder extends CarBuilder{
    private CarModel carModel = new BMWModel();
    public void setSequence(List<String> sequence) {
        this.carModel.setSequence(sequence);
    }

    public CarModel getCarModel() {
        return carModel;
    }
}
