package com.company.extend_Demo2;

public class Main implements A,B {
    //we need to implement all the methods in the parent as well as child interface
//    @Override
//    public void greet(){
//
//    }

    @Override
    public void meet(){

    }

    @Override
    public void fun() {

    }

//    @Override
//    public void greet() {
//        System.out.println("This method will be obviously preferred over the default greet as it is in this class");
//    }
    //this method may or may not be written here or overridden here

    public static void main(String[] args) {
        Main m = new Main();
        m.greet(); //if greet method is defined in this class too
        //if not defined , the default one will run
//        m.greet();
    }
}
