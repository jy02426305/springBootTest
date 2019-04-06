package com.cyx.anno.impl;

import com.cyx.anno.Car;

public class Ford implements Car {
    @Override
    public void print() {
        System.out.println("我是一辆福特汽车");
    }
}
