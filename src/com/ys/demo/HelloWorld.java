package com.ys.demo;


import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {

    public HelloWorld() {
    }

    public static int getIntialSize() {
        return INTIAL_SIZE;
    }

    private final static int INTIAL_SIZE=50;
    public static void main(String[] args) {
        System.out.println("helloworld");

        ArrayList list1 = new ArrayList();
        ArrayList list2 = null;

        Date date = new Date();
        list1.add(0,123);
        method2();
    }

    public static void method2() {

    }
}
