import java.util.*;

public class switchexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch(choice){
            case 1 :System.out.println("Samosa");break;
            case 2 :System.out.println("Burger");break;
            case 3: System.out.println("Mango Shaker");break;
            default :System.out.println("Water");
        }
        sc.close();
    }
    
}
