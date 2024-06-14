import java.util.*;


public class largestoftwonum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println(a + " is greater");
        }else if(a == b){
            System.out.println(a + " and "+ b + " both are greater");
        }else{
            System.out.println(b + " is greater");
        }
        sc.close();
    }
    
}
