package com.ucx.training.sessions.session2;

public enum Error{
    ERR_100("100", "User not found!"),
    ERR_101("101", "Customer cannot be retrieved!");

    private final String code;
    private final String description;

    Error(String code, String description){
        this.code = code;
        this.description = description;
    }

    public String getCode(){
        return this.code;
    }

    public String getDescription(){
        return this.description;
    }
}
