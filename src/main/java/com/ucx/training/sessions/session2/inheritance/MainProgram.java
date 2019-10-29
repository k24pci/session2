package com.ucx.training.sessions.session2.inheritance;

import java.util.logging.Logger;

public class MainProgram {
    private static final Logger LOGGER = Logger.getLogger(MainProgram.class.getName());

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        LOGGER.info(subClass.toString());
    }
}
