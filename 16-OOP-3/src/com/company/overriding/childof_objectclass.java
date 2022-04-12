package com.company.overriding;

//public class childof_objectclass extends Object{ //by default every class extends the object class
public class childof_objectclass{

    int num;

    childof_objectclass(int number){
        this.num = number;
    }

    @Override //this toString overrides the toString method
    public String toString(){
        return "hey";
    }

    public static void main(String[] args) {
        childof_objectclass obj = new childof_objectclass(44);
        System.out.println(obj);//prints the toString method from Object class as we haven't defined any
        //toString method ourselves
        //But what if we do?
        //Let do it

    }

}
