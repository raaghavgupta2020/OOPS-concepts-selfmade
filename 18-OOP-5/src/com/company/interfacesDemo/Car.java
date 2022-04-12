package com.company.interfacesDemo;

//now in this Car class we can do multiple inheritance (as many no. of interfaces as we want) using the implements keyword
public class Car implements Engine,Brake,Media {

    //All the methods in the interfaces are abstract by default
    //hence we need to override all of these methods


    //even if I make objects of the reference variable type Engine, Media or Brake , and I call any method using that
    // object , obviously ,these methods will be running, as these are the overridden methods
    //hence if for example, I make an object of Media ref var type, and I call the method start, then the output will be
    //i start like a normal car , i.e, our car started , this is very vague ,hence , to overcome this we need to make
    //separate classes for separate interfaces
    @Override
    public void acc() {
        System.out.println("I accelerate like a normal car");
    }

    @Override
    public void brake() {
        System.out.println("I break like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car");
    }
}
