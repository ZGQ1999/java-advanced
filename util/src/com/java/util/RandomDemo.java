package com.java.util;

import java.util.Random;

/**
 * created by 国庆
 * 随机数类练习
 */
public class RandomDemo {
    //随机生成5以内的数，包括5
    public static void main(String[] args) {
        Random random = new Random();
        //[0,bound)
        int num = random.nextInt(6);
        System.out.println(num);
    }
}
