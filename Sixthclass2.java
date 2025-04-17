
import java.util.Scanner;

public class Sixthclass2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaration

        // int[] numbers;
        // String[] names;

        // Initialization

                /*  a. Static Initialization
        You can initialize an array at the time of declaration using an array initializer: */

        // int[] numbers = {1, 2, 3, 4, 5};
        // String[] names = {"Alice", "Bob", "Charlie"};

        /* b. Dynamic Initialization
        You can also initialize an array by specifying its size, followed by assigning values to its elements:*/

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        System.out.println(numbers[2]);

        String[] names = new String[3];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";

        System.out.println(names[1]);
        

        // Accessing Array Elements
// You can access and modify array elements using their index, which starts from 0:

int[] number = {1, 2, 3, 4, 5};
System.out.println(number[0]); // Output: 1
numbers[1] = 10;
System.out.println(number[1]); // Output: 10

        sc.close();
    }
    
}
