package com.soft1841.oop.week1.sample3;

public class Bird extends  FlyObject {
    public Bird (String name, double speed) {
        super(name, speed);
    }
    public String fly () {
        return "飞禽名称："+this.name+",飞行速度："+this.speed+"km/h";
    }
}
