import java.util.*;
public class loopsQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for(int i =0;i<5;i++){
        //     System.out.println("Hello");
        //     i+=2;
        // }

        // for(int i=0;i<=5;i++){
        //     System.out.println("i = " + i);
        // }

        int n = sc.nextInt();

        for(int i =1;i<=10;i++){
            System.out.println(n +" * " + i + " = " + n*i);
        }
        sc.close();
       
    }
    
}
