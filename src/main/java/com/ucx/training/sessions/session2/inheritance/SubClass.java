package com.ucx.training.sessions.session2.inheritance;

import java.util.logging.Logger;

public class SubClass extends SuperClass{
    private static final Logger LOGGER = Logger.getLogger(SubClass.class.getName());
    private String name;

    public SubClass(){
        LOGGER.info("Inside SubClass.");
        LOGGER.info(super.toString());
        name = "SubClass";
    }

    @Override
    public String toString(){
        return name;
    }
}
