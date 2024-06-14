import java.util.*;

public class averageofthreenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C =sc.nextFloat();
        float N = sc.nextFloat();

        double average = (A + B + C) / N ;
        System.out.println(average);
        sc.close();


    }
    
}
