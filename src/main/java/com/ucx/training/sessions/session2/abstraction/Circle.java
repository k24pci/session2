package com.ucx.training.sessions.session2.abstraction;

public class Circle extends Shape {
    private int r;

    public Circle(int r, String name){
        super(name);
        this.r = r;
    }

    @Override
    public double calculateArea()
    {
        return Math.PI * this.r * this.r;
    }
}
