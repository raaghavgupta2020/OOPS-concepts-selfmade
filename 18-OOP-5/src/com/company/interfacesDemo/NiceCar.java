package com.company.interfacesDemo;

public class NiceCar {

//    Engine engine;

    //data hiding can be done here - keep the variables private
    private Engine engine;
    private Media player = new CDplayer();//methods from CDplayer class will be accessed
    //this nice car has its own engine variable of the type Engine

    public NiceCar(){
        engine = new PowerEngine();//methods from PowerEngine class will be accessed
    }

    //we can give engine while creating the object and the niceCar created will have that type of engine
    public NiceCar (Engine engine){
        this.engine = engine;
    }

    public void start_engine(){
        engine.start(); //now the engine will run accordingly
    }

    public void stop_engine(){
        engine.stop(); //now the engine will run accordingly
    }

    public void start_music(){
        player.start();
    }

    void stop_music(){
        player.stop();
    }

    public void upgrade_engine(){
        this.engine = new ElectricEngine();
    }
}
