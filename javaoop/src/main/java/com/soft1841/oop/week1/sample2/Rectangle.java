package com.soft1841.oop.week1.sample2;

public class Rectangle extends  Shape{
    public  Rectangle(){

    }

    public Rectangle (double x, double y) {
        super(x, y);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("矩形面积是：");
    }

    public double getArea() {
        return super.x*super.y;
    }


}
