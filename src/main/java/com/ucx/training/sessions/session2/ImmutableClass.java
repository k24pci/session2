package com.ucx.training.sessions.session2;

public class ImmutableClass {
    private final String name;
    private final String email;

    public ImmutableClass(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }
}
