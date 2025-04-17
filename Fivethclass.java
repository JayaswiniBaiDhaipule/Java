
import java.util.Scanner;

public class Fivethclass {

    public static void printName(String name){
        System.out.println(name);

    }

    //A METHOD to calculate sum of 2 numbers - a & b
    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static void printFactorial(int n) {
        //loop
        if(n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
 
 
        for(int i=n; i>=1; i--) {
            factorial = factorial * i;
        }
 
 
        System.out.println(factorial);
    }
   
 

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Functions/Methods

        /* returntype functionName(type arg1,type arg2) {
        }
        */

        // void - return type means nothing


        // public and static --> keywords 
        // we have to write infront of return type
        // It cannnot be a keyword

        // function --> inputs --> arguments written as " type argument"
        // differnt types of arguments can be given as input

        // Function Call

        String name = sc.nextLine();
        printName(name);


        // sum of two numbers
        int a = 10;
        int b = 20;
        sum(a, b); // Function Call

        // Write a function to multiply 2 numbers.

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
 
 
        int result = multiply(a1, b1);
        System.out.println(result);
 

        // Qs. Write a function to calculate the factorial of a number.

        int n = sc.nextInt();
        printFactorial(n);

        

        sc.close();
    }
    

}
