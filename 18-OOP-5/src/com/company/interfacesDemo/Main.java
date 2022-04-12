package com.company.interfacesDemo;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        //all this is overriding only
        //which particular method to run is determined on runtime
//        car.acc();
//        car.start();
//        car.stop();
//        car.brake();

//        Media object = new Car(); //the reference variable is of the type Media , lets try to call some func using this object
//        object.start();//let's see if this starts the media

//        //we tried starting media player,  and our car started , this was very vague
//        //hence, we can create separate classes to implement separate interfaces

        //___________________________________________________________________________

        NiceCar car2 = new NiceCar();
//        //by default engine is power engine
//
//        car2.start_engine();
//        car2.start_music();
//        car2.stop_engine();
//        car2.stop_music();
//        car2.upgrade_engine();
//        //earlier we were required to change the entire car if we want to change the engine
//        //now we can change the engine without changing the car
//        car2.start_engine();
//        car2.start_music();
//        car2.stop_engine();
//        car2.stop_music();

        NiceCar car3 = car2;
        car3.start_engine();

        Engine obj = new ElectricEngine();
        NiceCar car4 = new NiceCar(obj);//Im passing Engine type object
        car4.start_engine();

    }
}
