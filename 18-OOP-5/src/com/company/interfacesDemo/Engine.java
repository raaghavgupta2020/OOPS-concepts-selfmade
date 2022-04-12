package com.company.interfacesDemo;

public interface Engine {

    int price = 78000; //this will be by default static and final hence , it has to initilaised here only
    //(static final int price = 78000)


    void start(); //these methods are abstract by default
    void stop();
    void acc();

}
