package com.company.packages.a;

import static com.company.packages.b.Message.message;

public class Greeting {
    public static void main(String[] args) {
        message();
        //we are using the code written in package b in package a.
    }
}
