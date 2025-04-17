
import java.util.Scanner;

public class Sixthclass {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {


        // type[] arrayName = new type[size];
        // int[] marks = new int[3];

        int marks[] = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

        for(int mark : marks){

        System.out.println(mark);
        }


        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        for(int i = 1;i<3;i++){
            System.out.println(marks[i]);
        }

        // type[] arrayName = {}

        int student[] = {23,45,62};

        for(int stu : student){
            System.out.println(stu);
        }

        System.out.println(marks.length);
        
        //size

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];
        for (int num : numbers) {
            System.out.println(numbers[num]);
            
        }
       

        // 2D Arrays

        // type[][] arrayName = new Type[rows][columns];
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] nums = new int[3][5];

        // input
        // rows

        for(int i = 0;i<rows;i++){
            // columns
            for(int j = 0;j<cols;j++){
                nums[i][j] = sc.nextInt();
            }
        }


        // outputs

        for(int i = 0;i<rows;i++){
            // columns
            for(int j = 0;j<cols;j++){
                System.out.println(nums[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}
