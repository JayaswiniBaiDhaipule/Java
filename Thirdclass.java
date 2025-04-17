
import java.util.Scanner;

public class Thirdclass {
    /**
     * @param args
     */
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // conditional Statements

    /*   1. if(condition){

        }else{

        } */

        // Practice
        // 1 .Adult or not

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("You are Adult");
        }else{
            System.out.println("You are not Adult");
        }
        

        // 2 . Even or odd

        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " is an Even Number");
        }else{
            System.out.println(num + " is an Odd Number");
        }

        // 3. user ---a,b
        // 1.a=b --->equal
        // 2.a>b ---> a is greater than b
        // 3.a<b ---> b is greater than a

    /*   1. if(condition){

        }else if(condition){

        } else{
         
        }    */


        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b){
            System.out.println(a + " is equal to "+ b);
        }else if (a > b) {
            System.out.println(a + " is greater than " + b);  
        }else{
            System.out.println(b + " is greater than " + a);
        }


        // switch

        int button = sc.nextInt();

        switch (button) {
            case 1 -> System.out.println("Hello");
            case 2 -> System.out.println("Namaste");
            case 3 -> System.out.println("Bonjour");
            default -> System.out.println("Invalid Button");                
        }

        // Practice
        /* 
Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.
*/

int num1 = sc.nextInt();
int num2 = sc.nextInt();

int operator = sc.nextInt();

switch(operator) {
    case 1 -> System.out.println("Addtion of two numbers is : " + (num1+num2));
    case 2 -> System.out.println("Subtraction of two numbers is : " + (num1-num2));
    case 3 -> System.out.println("Multiplication of two numbers is : " + (num1*num2));
    case 4 -> {
        if(b==0){
            System.out.println("Invalid Division");
        }else{
            System.out.println("Division of two numbers is : " + (num1/num2));
        }       }
    case 5 -> {
        if(b==0){
            System.out.println("Invalid Division");
        }else{
            System.out.println("Modulo Division of two numbers is : " + (num1%num2));
        }       }
    
    default -> System.out.println("Invalid Operator");
}

// Practice 
/*Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on */

int monthNumber = sc.nextInt();
/* 
switch (monthNumber) {
    case 1:System.out.println("January");break;
    case 2:System.out.println("Feburary");break;
    case 3:System.out.println("March");break;
    case 4:System.out.println("April");break;
    case 5:System.out.println("May");break;
    case 6:System.out.println("June");break;
    case 7:System.out.println("July");break;
    case 8:System.out.println("August");break;
    case 9:System.out.println("Septumber");break;
    case 10:System.out.println("October");break;
    case 11:System.out.println("November");break;
    case 12:System.out.println("December");break;
    default:System.out.println("Invalid Month");
}
*/

switch (monthNumber) {
    case 1 -> System.out.println("January");
    case 2 -> System.out.println("Feburary");
    case 3 -> System.out.println("March");
    case 4 -> System.out.println("April");
    case 5 -> System.out.println("May");
    case 6 -> System.out.println("June");
    case 7 -> System.out.println("July");
    case 8 -> System.out.println("August");
    case 9 -> System.out.println("Septumber");
    case 10 -> System.out.println("October");
    case 11 -> System.out.println("November");
    case 12 -> System.out.println("December");
    default -> System.out.println("Invalid Month");
}
 sc.close();

    }

    
}
