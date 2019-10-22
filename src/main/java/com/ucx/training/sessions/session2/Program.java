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

        C c1 = new C();
        C c2 = new C();


        System.out.println(c1.getName());
        System.out.println(c2.getName());
        Program program = new Program();
        program.printValue();
    }

    private void printValue(){
        System.out.println(x);
    }
}
