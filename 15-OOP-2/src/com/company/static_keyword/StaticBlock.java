package com.company.static_keyword;

public class StaticBlock {
    static int a ;
    static int b ;
    //here i've declared 2 static variables but i've not initialised these , as i cannot use
    //an object to initialise or modify these , i've to use a static block to do so


    //THIS STATIC BLOCK IS RUN ONLY ONCE , ONLY WHEN FIRST OBJECT IS CREATED ,i.e, WHEN THE CLASS IS LOADED
    //FOR THE FIRST TIME

    static {
        System.out.println("In static block");
        a = 20;
        b = a*5;
    }

    public static void main(String args[]){

//        StaticBlock obj1 = new StaticBlock();
//        as soon as the object is created , all the static stuff starts to execute first
        System.out.println(StaticBlock.a + " " + StaticBlock.b);


//        now when this 2nd object is created , the static block is not run again
//        StaticBlock obj2 = new StaticBlock();
//        System.out.println(StaticBlock.a + " " + StaticBlock.b);
//
//
//        StaticBlock obj3 = new StaticBlock();
//        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
