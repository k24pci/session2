package com.ucx.training.sessions.session2.inheritance;

import java.util.logging.Logger;

public class SubClass extends SuperClass{
<<<<<<< HEAD
    private static final Logger LOGGER = Logger.getLogger(SuperClass.class.getName());
=======
    private static final Logger LOGGER = Logger.getLogger(SubClass.class.getName());
>>>>>>> d0a6eb13c3c4b0eaa6bf22737e04a25705e4f3fb
    private String name;

    public SubClass(){
        LOGGER.info("Inside SubClass.");
        LOGGER.info(super.toString());
<<<<<<< HEAD
        name = "Sub Class.";
=======
        name = "SubClass";
>>>>>>> d0a6eb13c3c4b0eaa6bf22737e04a25705e4f3fb
    }

    @Override
    public String toString(){
        return name;
    }
}
