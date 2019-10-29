package com.ucx.training.sessions.session2.inheritance;

import java.util.logging.Logger;

public class SuperClass {
    private static final Logger LOGGER = Logger.getLogger(SuperClass.class.getName());
    private String name;

    public SuperClass(){
        LOGGER.info("Inside Super Class.");
        name = "SuperClass";
    }

    @Override
    public String toString(){
        return name;
    }
}
