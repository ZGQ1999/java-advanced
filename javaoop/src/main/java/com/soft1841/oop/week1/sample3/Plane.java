package com.soft1841.oop.week1.sample3;

public  class Plane extends  FlyObject {
    public Plane(String name, double speed) {
        super(name, speed);
    }
    public String fly() {
        return "飞机型号：" + this.name + ",飞行速度：" + this.speed + "km/h";
    }
}