package com.company.static_keyword;

public class Main {
    public static void main(String[] args) {
        //as we are in the same package/folder as the Human class hence we can directly access it here and we
        //are not required to 'import' anything.

//        Human raghav = new Human(20,"Raghav",false,15000);
//        Human kunal = new Human(21,"kunal",false,15055);

        System.out.println(Human.population);

        // I can still use this human.population even if there is no object created as population
        // is a static variable and it is independent of the objects.
        // it will then give the default value of long , i.e , 0 , in that case
    }
}
