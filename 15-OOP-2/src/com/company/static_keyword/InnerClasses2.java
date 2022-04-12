package com.company.static_keyword;

class Test2{ //here this Test2 class does not depend on any other class ,hence we can
    //use it directly as we did
    static String s;
    public Test2(String name){
        Test2.s = name;
    }
}
public class InnerClasses2 {
    public static void main(String[] args) {
        Test2 obj = new Test2("Raghav");//can be directly used like this
        Test2 obj2 = new Test2("Shantanu");//can be directly used like this

        System.out.println(obj.s);
        System.out.println(obj2.s);
    }
}
