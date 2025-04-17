
import java.util.Scanner;


public class Secondclass {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // Output - we can use double quotes as well as single quote
        // But string commonly written in double quotes

        // 1.print --- System.out.print();
        // 2.println ---System.out.println();
        // 3.\n --- to print in next line


        System.out.println("Hello Jay");
        System.out.println("Hello World");
        System.out.print("Hello World with Java\n");

        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");

        // variables --- to store a value

        String name = "Tony Stark";
        int age = 24;
        double price = 25.55; 

        System.out.println(name);
        System.out.println(age);
        System.out.println(price);

        // data types --- to declare  a variable

        // 1. primitive Data Type --- 8 types
        // int --- 4 bytes
        // long --- 8 bytes
        // float --- 4 bytes
        // double --- 8 bytes
        // byte --- 1 byte
        // short --- 2 bytes
        // char --- 1 byte
        // boolean --- 1 byte

        // 2. Non Primitive Data types

        // String,Array,class,object...

        int a = 10;
        int b = 5;

        int sum = a +  b;
        System.out.println(sum);

        int diff = a - b;
        System.out.println(diff);

        int cal = (a*b)/(a-b);
        System.out.println(cal);

        int ans = a * b / a-b;
        System.out.println(ans);


        // To get Input --- we take input by using a  scanner class

        //  we have to import a scanner class
        // i.e import java.util.scanner;
        Scanner sc = new Scanner(System.in);
        String myname = sc.nextLine();
        System.out.println(myname);

        // nextint();



        // Practice 

        // 1. Take two variables from user and return their sum

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int sum1 =  a1 + b1;
        System.out.println("The sum of two numbers: "+ sum1);

        //  2.Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.

        final float pie = 3.14f;
        float radius = sc.nextFloat();
        float area = pie * radius * radius;
        System.out.println("The area of the circle is : "+ area);


        // 3.Make a program that prints the table of a number that is input by the user.

        int num = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println( num + " * "+ num+" = " + num * i);
            
        }
        sc.close();


    }
    
}
