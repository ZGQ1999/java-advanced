package com.java.util;
/**
 * created by 国庆
 * 2019.03.18
 */

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDifferentExample {
    public static void main(String[] args) {
        //分别定义起止时间
        String firstTime = "2019-3-16 20:20:20";
        String thirdTime = "2019-3-17 01:20:40";
        String forthTime = "2019-3-18 06:30:40";
        String fifthTime = "2019-3-18 08:10:50";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentTime = new Date();
        String secondTime = format.format(currentTime);
        Date d1,d2,d3,d5;
        long diff1 = 0;
        long diff2 = 0;
        long diff3 = 0;
        //通过SampleDateFormat的对象来把String类型的时间对象转化为Date类型的对象
        try {
            d1 = format.parse(firstTime);
            d2 = format.parse(secondTime);
            d3 = format.parse(thirdTime);
            d5 = format.parse(fifthTime);
            //毫秒ms的差值
            diff1 = d2.getTime() - d1.getTime();
            diff2 = d2.getTime() - d3.getTime();
            diff3 = d2.getTime() - d5.getTime();
        }catch (ParseException e){
            e.printStackTrace();
        }
        //将毫秒分别换算为分、小时、天
        long diffMinutes = diff3 / (1000*60);
        long diffHours   = diff2 / (1000*60*60);
        long diffDays    = diff1 / (1000*60*60*24);
        System.out.println("现在时间："+secondTime);
        System.out.println(firstTime+"   "+Math.abs(diffDays)+"天前");
        System.out.println(thirdTime+"   "+Math.abs(diffHours)+"小时前");
        System.out.println(fifthTime+"   "+Math.abs(diffMinutes)+"分前");
        System.out.println(forthTime+"   " + " 刚刚");
    }
}

