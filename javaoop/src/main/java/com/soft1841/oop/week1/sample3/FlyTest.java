package com.soft1841.oop.week1.sample3;

public class FlyTest {
    public static void main (String[] args) {
        Fly fly1 =new Plane("超音速",960.0);
        System.out.println(fly1.fly());
        Fly fly2=new Bird("秃鹫",90.8);
        System.out.println(fly2.fly());
    }
}
