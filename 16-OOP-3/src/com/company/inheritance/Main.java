package com.company.inheritance;

public class Main {
    public static void main(String[] args) {
////        Box box = new Box();
//        Box box = new Box(4);
////        Box box = new Box(4,5,6);
//        Box box2 = new Box(box);
//
//        System.out.println(box.l + " " + box.h + " " + box.w);
//        System.out.println(box2.l + " " + box2.h + " " + box2.w);

//        //creating object for box with weight
//        box_with_weight box3 = new box_with_weight();
//        System.out.println(box3.h + " " +box3.weight);

//        box_with_weight box4 = new box_with_weight(1,2,3,4);
//        System.out.println(box4.l);
//        System.out.println(box4.h);
//        System.out.println(box4.w);
//        System.out.println(box4.weight);


//        Box box5 = new box_with_weight(1,2,3,4);
//        System.out.println(box5.l);
//        System.out.println(box5.h);
//        System.out.println(box5.w);
////        System.out.println(box5.weight); //gives error
//        //but this can't be accessed as the members which can be accessed
//        //by this box5 object does not depend on the type of object which
//        // is being created , rather, it
//        //depends on the class type of the reference variable

        //whereas,

//        box_with_weight box6 = new Box(1,2,3,4);//this isn't possible

//        box_with_weight box7 = new box_with_weight(box4);
//        System.out.println(box7.l);
//        System.out.println(box7.h);
//        System.out.println(box7.w);
//        System.out.println(box7.weight);


//        box_with_price box8 = new box_with_price(15);
//        System.out.println(box8.w + " " + box8.h + " " + box8.l + " " + box8.weight + " " + box8.price + " " );

        box_with_price box9 = new box_with_price(15 , 16 ,300);
        System.out.println(box9.w + " " + box9.h + " " + box9.l + " " + box9.weight + " " + box9.price + " " );

    }
}
