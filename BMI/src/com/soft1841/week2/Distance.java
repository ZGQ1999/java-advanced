package com.soft1841.week2;

import java.util.Random;

/**
 * 两点间距离小程序
 * @auther 国庆
 * 2018,10,17
 */
public class Distance {
    public static void main(String[] args) {
        //随机产生（x1,y1)  (x2,y2)
        int x1;
        int y1;
        int x2;
        int y2;
        Random random = new Random();
        x1 = random.nextInt(1024);
        y1 = random.nextInt(768);
        x2 = random.nextInt(1024);
        y2 = random.nextInt(768);
        System.out.println("两点之间的距离是：");

        double distance = (x1-x2)*(x1-x2)-(y1-y2)*(y1-y2);
        double result=Math.sqrt(distance);
        System.out.println("结果是" + distance);




    }
}
