package com.company.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton object1 = Singleton.getInstance();

        //now if we make more ref variables here , they will all be
        // returned with the same instance created first, hence all
        // consecutive ref variables will be pointing to the same object.

        Singleton object2 = Singleton.getInstance();
        Singleton object3 = Singleton.getInstance();

    }
}
