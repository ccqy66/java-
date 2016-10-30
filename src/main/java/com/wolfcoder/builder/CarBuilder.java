package com.wolfcoder.builder;

import java.util.List;

/**
 * Created by Administrator on 2016/10/30.
 */
public abstract class CarBuilder {
    public abstract void setSequence(List<String> sequence);
    public abstract CarModel getCarModel();
}
