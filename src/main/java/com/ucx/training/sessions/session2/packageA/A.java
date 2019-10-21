package com.ucx.training.sessions.session2.packageA;

public class A {
    private int x;
    protected int y;

    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return this.x;
    }

    private String display() {
        return "Inside object A";
    }

    public String display(String text){
        if (text == null){
            return display();
        }
        else {
            return text;
        }
    }
}
