package com.ucx.training.sessions.session2;

import com.ucx.training.sessions.session2.packageA.A;
import com.ucx.training.sessions.session2.packageB.B;

public class Program {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(a.getX());
        System.out.println(b.getValue());
        System.out.println(a.display("null"));
    }
}
