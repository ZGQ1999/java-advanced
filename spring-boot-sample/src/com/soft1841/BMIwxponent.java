package com.soft1841;

/**
 * 根据身高体重计算BMI的程序
 */
public class BMIwxponent {
    public static void main(String[] args) {
        double height = 1.72;
        double weight = 70;
        double exponent = weight / (height* height);
        System.out.println("您的身高为" + height);
        System.out.println("您的体重为" + weight);
        System.out.println("您的BMI指数为" + exponent);
        System.out.println("您的体重属于：");
        if (exponent < 18.5){
            System.out.println("体重过轻");
        }
        if (exponent >= 18.5 && exponent < 24.2){
            System.out.println("正常范围");
        }
    }
}
