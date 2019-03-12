package com.soft1841.week3;

import java.time.LocalTime;

/**
 * 和系统时间同步
 * 2018.10.24
 */
public class SystemTime {
    public static void main(String[] args) throws InterruptedException {
        //如何通过time的API指定一个结束时间
        LocalTime endTime = LocalTime.of(8, 45, 01);
        while (true) {
            //使用JDK8的时间API,获取当前系统时间，去掉毫秒
            LocalTime currentTime = LocalTime.now().withNano(0);
            System.out.println(currentTime);
            Thread.sleep(1000);
        }
    }

}