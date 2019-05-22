package com.soft1841.jdbc;

/**
 * 创建真实对象类
 * 2019.05.23
 */
public class RealSubject implements Subject {
    @Override
    public void buyMac() {
        System.out.println("买一台Mac");
    }
}
