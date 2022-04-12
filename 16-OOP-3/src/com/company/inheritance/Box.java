package com.company.inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //cube
    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }

    Box(double l , double h , double w){
        this.h=h;
        this.l=l;
        this.w=w;
    }


    //important

    Box ( Box old )
            //we are able to pass a box_with_weight object to Box constructor
            //copy constructor //"box4" object will come here and no error will be given as
            //box4 is an object of box_with_weight class
            //the child class can access the variables of the parent class
            //this is exactly same as
            //Box old = box4;
            //Box old = new box_with_weight(1,2,3,4); //which is possible
    {
        //weight can obviously not be accessed here by "old" as the reference variable old can only acces the members
        //present in Box class
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
