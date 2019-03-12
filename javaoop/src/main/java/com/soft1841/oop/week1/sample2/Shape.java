package com.soft1841.oop.week1.sample2;

public  abstract class Shape {
    protected  double x;
    protected  double y;

    public  Shape() {
    }

    public  Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void  show() {
        System.out.print("面积");
    }

    public  abstract  double getArea();

}
