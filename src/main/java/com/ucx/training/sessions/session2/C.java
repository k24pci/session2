package com.ucx.training.sessions.session2;

public class C {
    private static final String NAME = "finalName";
    private int count;
    private final String test;

//    public C(){
//       count++;
//    }

    public C(String test){
        this.test = test;
    }

    public String getName(){
        return NAME;
    }

    public int getCount(){
        return count;
    }
}
