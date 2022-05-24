package com.caiyx.jdk8.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Caiyx
 * @date 2022/05/24 09:53
 * @description
 */
public class ConsumerTest {
    public void test1(){
        Consumer<List<Integer>> c=s->s.forEach(t->System.out.println(t));
        c.accept(new ArrayList<Integer>(){{
            add(10);
            add(11);
            add(13);
        }});
    }

    public Consumer<String> test2(){
        Consumer<String> c=ConsumerTest::test2_1;
        return c;
    }

    public static void test2_1(String s){
        System.out.println(s);
    }

}
