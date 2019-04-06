package com.cyx.anno.impl;

import com.cyx.anno.Car;

public class Buick implements Car {
    @Override
    public void print() {
        System.out.println("我是一辆别克汽车");
    }
}
