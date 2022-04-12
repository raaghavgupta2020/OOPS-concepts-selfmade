package com.company;

public class Main {

    public static void main(String[] args) {
	    Student student1 = new Student();
        Student student2 = new Student(17,70.6f,"Kunal Kushwaha ");
        Student student3 = new Student(student1);

        System.out.println(student1.name);
        System.out.println(student2.marks);
        System.out.println(student3.rno);
        student2.greetings();
    }
}

class Student{
    int rno;
    float marks;
    String name;

    void greetings(){
        System.out.println("Hello! My name is " + name);
    }

    Student(Student s){ //here the parameter i've taken is of the type Student only
        this.rno = s.rno;
        this.marks = s.marks;
        this.name = s.name;
    }

    Student(){ //it is not the default constructor , this constructor is created by me only
    // if we don't have any of these constructors then the default constructor will be called

//        this.rno = 10;  //here 'this' keyword refers to the reference variable
//        this.marks = 80.7f;
//        this.name = "Raghav Gupta";


        //Calling a constructor from another constructor
        this(15,66.78f, "random name" ); // here, 'this' keyword refers to the Student class only

    }

    Student(int rno , float marks , String name){ //paramterised constructor
        this.rno = rno;
        this.marks = marks;
        this.name = name;
    }
}
