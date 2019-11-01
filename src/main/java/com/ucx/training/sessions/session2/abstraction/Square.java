package com.ucx.training.sessions.session2.abstraction;

public class Square extends Shape {
    private int a;

    public Square(int a, String name){
        super(name);
        this.a = a;
    }

    @Override
    public double calculateArea()
    {
        return 0;
    }
}
