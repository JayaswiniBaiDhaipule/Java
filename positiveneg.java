import java.util.*;

public class positiveneg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
         String type = (num>0) ? "positive" : "negative";
         System.out.println(type);
         sc.close();
    }
    
}
