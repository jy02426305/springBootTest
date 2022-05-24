package com.caiyx.jdk8;

import com.caiyx.jdk8.service.ConsumerTest;

/**
 * @author Caiyx
 * @date 2022/05/24 09:52
 * @description
 */
public class Jdk8Main {
    public static void main(String[] args) {
        new ConsumerTest().test1();

        new ConsumerTest().test2().accept("hello");
    }
}
