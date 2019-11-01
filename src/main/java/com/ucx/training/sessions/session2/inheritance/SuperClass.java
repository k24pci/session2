package com.ucx.training.sessions.session2.inheritance;

import java.util.logging.Logger;

public class SuperClass {
    private static final Logger LOGGER = Logger.getLogger(SuperClass.class.getName());
    private String name;

    public SuperClass(){
<<<<<<< HEAD
        LOGGER.info("Inside SuperClass.");
        name = "Super Class.";
=======
        LOGGER.info("Inside Super Class.");
        name = "SuperClass";
>>>>>>> d0a6eb13c3c4b0eaa6bf22737e04a25705e4f3fb
    }

    @Override
    public String toString(){
        return name;
    }
}
