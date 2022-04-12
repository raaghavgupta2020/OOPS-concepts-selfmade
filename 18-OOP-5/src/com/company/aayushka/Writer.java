package com.company.aayushka;

public class Writer {
    static int a = 50;
    public static void write() { //static method
        System.out.println("Writing");
    }
}

class Author extends Writer {
//    static int a ;
//    @Override //giving error , hence static methods cannot be overridden
    public static void write() {
        System.out.println("Writing book");
    }
}

class Programmer extends Writer {

    public static void write() {
        System.out.println("Writing code");
    }

    public static void main(String[] args) {

        //lets try overriding
        Writer w = new Programmer();
        w.write();

        Writer secondWriter = new Author();
        secondWriter.write();

        Writer thirdWriter = null;
        thirdWriter.write();
        //in each case , the method called is of the parent class itself , hence ,overriding fails as we are using
        //a static method


        //now lets normally create an object of the child class 'Author' and try to access the 'write()' method
        // , using this object
        //reference variable type is changed here
        Author firstAuthor = new Author();
        firstAuthor.write();
        System.out.println(Writer.a);
        System.out.println(firstAuthor.a);
    }
}
