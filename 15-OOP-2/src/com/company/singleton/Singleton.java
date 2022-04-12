package com.company.singleton;

public class Singleton {
    private Singleton(){ //private constructor , so that we can restrict people from
    //using constructors

    }

    //we only need one instance/object
    //lets create an instance
    private static Singleton instance;//we can make this static as well as this instance is
    //not depending on object of singleton class


    //creating a function that will give us the instance
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton(); //here constructor can be called as we are in the same
            //class where the private constructor is present , hence it can be used here

        }
        return instance;
    }
}
