package com.example.user.zoo;

/**
 * Created by user on 10/11/2017.
 */

class Person {

    public void visitZoo(Zoo zoo) {
        zoo.sellTicket();
        zoo.addVisitor(this);
    }
}
