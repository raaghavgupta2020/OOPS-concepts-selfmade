package com.company.Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

//Lambda functions are just inline functions
//when we have just one line inside a function than it can be replaced by a lambda expression
// ,and it doesn't require the name of the function everytime

public class LambdaFunctions{
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            arr.add(i+1);
//        }

        //forEach takes consumer type , i.e, it takes <T> (a particular data type) and has void return type
//        arr.forEach((item) -> System.out.println(item * 2));
        //item represents every single thing in array one by one // internally executing a for loop only

        //This can also be used by creating object of the Consumer class
        //*IMPORTANT* - basically we can assign lambda expressions to the variables that are of the type interfaces
//        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
//        arr.forEach(fun);

        //Now we want to do this with multiple parameters , we have to use interfaces

        Operation sum = (a,b) -> (a+b);  //*IMPORTANT* HERE VARIABLE IS 'sum' and WHATEVER IS WRITTEN ON THE R.H.S OF = IS THE BODY
        //WHEN THE ABSTRACT METHOD IS CALLED USING THE VARIABLE NAME , THEN IT WILL TRY TO FIND ITS BODY WHICH IS HERE
        Operation product = (a,b) -> (a*b);
        Operation sub = (a,b) -> (a-b);
        Operation div = (a,b) -> (a/b);

        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println(myCalculator.operate(5,3,sum));
        System.out.println(myCalculator.operate(5,3,product));
        System.out.println(myCalculator.operate(5,3,sub));
        System.out.println(myCalculator.operate(5,3,div));
    }

    //NOW CALLING CAN BE DONE LIKE THIS
    private int operate(int a, int b , Operation op){
        return (op.operation(a,b));
    }

}

//HERE THE INTERFACE IS OPERATION
//HENCE WE CAN ASSIGN LAMBDA EXPRESSIONS TO THE VARIABLES OF TYPE OPERATION
interface Operation{
    int operation(int a , int b); // WE CAN HAVE MULTIPLE PARAMETERS
}




