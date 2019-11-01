package com.ucx.training.sessions.session2.abstraction;

import java.util.logging.Logger;

public class AbstractionProgram {
    private static final Logger LOGGER = Logger.getLogger(AbstractionProgram.class.getName());

    public static void main(String[] args) {
        Shape shape = new Square(3, "Square");
        LOGGER.info("Square area: " + shape.calculateArea());
    }
}
