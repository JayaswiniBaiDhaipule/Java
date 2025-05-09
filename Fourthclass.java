
import java.util.Scanner;

public class Fourthclass {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        // Loops ---A loop is used for executing a block of statements repeatedly until a particular  condition is satisfied. 
        // A loop consists of an initialization statement, a test condition and an increment statement.

        // for loop

           /*for (initialization; condition; update) { 
                 // body of-loop 
                    }
           */
        for(int i =1;i<=10;i++){
            System.out.println(i);
        }


        // While loop

        /*while(condition) { 
            // body of the loop 
           }
            */
        int i = 0;
        while(i<=20) {
            System.out.println(i);
            i++;
        }
            
        // do while loop

        /*do { 
                // body of loop; 
            } 
                // while (condition);
        */
           
        int j = 2;
        do {
            System.out.println(j);
            j++;
        } while(j<=20);
           

        // Practice

        // 1.Print all even numbers till n.

        int n =25;
        for(int k = 1;k<=n;k++){
            if(k % 2==0){
            System.out.print(k+" ");
            }
        }

        /*
2. Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
Because marks don’t matter but our effort does. 
    */

    int input;


    do {
        int marks = sc.nextInt();
        if(marks >= 90 && marks <= 100) {
            System.out.println("This is Good");
        } else if(marks >= 60 && marks <= 89) {
            System.out.println("This is also Good");
        } else if(marks >= 0 && marks <= 59) {
            System.out.println("This is Good as well");
        } else {
            System.out.println("Invalid");
        }


        System.out.println("Want to continue ? (yes(1) or no(0))");
        input = sc.nextInt();
   
    } while(input == 1);

        sc.close();
    }
    
}
