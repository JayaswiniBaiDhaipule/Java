import java.util.*;

public class evenandodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        if(num%2 == 0){
            System.out.println(num + " is even number");
        }else{
            System.out.println(num + " is odd number ");
        }
        sc.close();
    }
    
}
