package com.ucx.training.sessions.session2;

public class C {
    private static final String NAME = "finalName";
    private int count;

    public C(){
       count++;
    }

//    public C(String name){
//        name = name;
//    }

    public String getName(){
        return NAME;
    }

    public int getCount(){
        return count;
    }
}
