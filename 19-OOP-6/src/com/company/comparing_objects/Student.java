package com.company.comparing_objects;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student>{ //I want to compare each Student type object to a Student type object only
    int rollno;
    float marks;

    public Student(int rollno  , float marks){
        this.rollno = rollno;
        this.marks = marks;
    }

    //this compareTo methods needs to be overridden

    @Override
    public int compareTo(Student o) {
//        int diff = (int)(this.marks - o.marks); //here we are basically defining , on what basis we want the comparison of the objects
        int diff = (this.rollno - o.rollno);
        //if diff == 0 ; both are equal
        //if diff < 0 ; o is bigger
        //if diff > 0 ; o is smaller

        return diff;
    }

    @Override
    public String toString() {
        return rollno+" : "+marks; //very nice little trick here
    }

    public static void main(String[] args) {

        Student raghav = new Student(12,89.55f);
        Student kunal = new Student(14,86.55f);
        Student hardik = new Student(77,34.55f);
        Student chhavi = new Student(17,67.55f);
        Student kuchu = new Student(19,55.55f);

        //let's say I have a list of students now, and I want to sort the list based on some comparison , then on which parameter will java sort the list?
        //this can be defined in 2 ways-> 1)either we can use the compare to method by implementing the Comparable interface with <Student>
        //or we can also , 2)we can add a new Comparator along with sort as well.
        Student[] list = {raghav,kunal,hardik,chhavi,kuchu};

        System.out.println(Arrays.toString(list));

//        Arrays.sort(list);

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int)(o1.marks-o2.marks) ;
//                //this method is basically overriding the Comparator method
//            }
//        });
        //We can write the same thing using lambda expressions also
        Arrays.sort(list, (o1,o2) -> (int)(o1.marks - o2.marks));

        System.out.println(Arrays.toString(list));


        //raghav and kunal are 2 objects of the type Student

//        if(raghav > kunal){
//            System.out.println("Raghav has more marks");
//        }

        //now java is confused whether it has to compare the rollno or the marks hence we have to implement the interface 'Comparable'
        //Comparable is an implement with Generic Types


        //actual way to mow compare these 2 objects is by using the compare to method
        if(raghav.compareTo(kunal) < 0){
            System.out.println("raghav has less marks");
        }else{
            System.out.println("raghav has more marks");
        }
    }


}
