package com.ucx.training.sessions.session2;

import com.ucx.training.sessions.session2.packageA.A;
import com.ucx.training.sessions.session2.packageB.B;

public class Program {
    private static int x = 0;

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(a.getX());
        System.out.println(b.getValue());
        System.out.println(a.display("null"));

        Program program = new Program();
        program.printValue();

        final ImmutableClass immutable = new ImmutableClass("Agon", "agon@email.com");
        ImmutableClass immutable2 = new ImmutableClass("Arta", "arta@email.com");
//        immutable = new ImmutableClass("agron", "agron@email.com");
        System.out.println(immutable.getName() + immutable.getEmail());
        System.out.println(immutable2.getName() + immutable2.getEmail());

        Error error = Error.ERR_100;
        System.out.println(error.getCode() + " " + error.getDescription());
        for (Error error1 : Error.values()){
            System.out.println(error1.getCode() + " " + error1.getDescription());
        }
    }

    private void printValue(){
        System.out.println(x);
    }
}
