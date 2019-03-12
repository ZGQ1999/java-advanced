package com.soft1841.oop.week1.sample3;

public  abstract  class FlyObject  implements  Fly{
    protected   String name;
    protected  double speed;

    public FlyObject (String name, double speed) {
        this.name = name;
        this.speed = speed;
    }
}
