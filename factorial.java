import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n =1;
    
        for(int i =2;i<=num;i++){
            n = n * i;
        }
        System.out.println(n);
        sc.close();
        
    }
    
}
