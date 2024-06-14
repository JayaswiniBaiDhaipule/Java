import java.util.*;
public class multiplesofanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    
        for(int n =2;n<=100;n++)
        if(num % n == 0 ){
            System.out.println(n);
        }
        sc.close();

    }
    
}
