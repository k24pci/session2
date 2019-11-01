package com.ucx.training.sessions.session2.inheritance;

import java.util.logging.Logger;

public class SuperClass {
    private static final Logger LOGGER = Logger.getLogger(SuperClass.class.getName());
    private String name;

    public SuperClass(){
        LOGGER.info("Inside SuperClass.");
        name = "Super Class.";
    }

    @Override
    public String toString(){
        return name;
    }
}
