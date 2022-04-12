package com.company.static_keyword;

public class InnerClasses {

    static class Test{ //this class is itself depending on the InnerClasses class hence has
        //to be made static to be used like this
        //since this class is static now hence it does not depend on the objects of InnerClasses class
        //it doesn't mean that the class is static ot that it won't depend on objects of itself
        //this is inside InnerClasses class , hence if it is now static , it means that it will not
        //depend on the objects of Innerclasses class
        String s;
        public Test(String name){
            this.s = name;
        }
    }

    public static void main(String[] args) {
        Test obj = new Test("Raghav");//can be directly used like this
        Test obj2 = new Test("Shantanu");//can be directly used like this

        System.out.println(obj.s);
        System.out.println(obj2.s);
    }

}
