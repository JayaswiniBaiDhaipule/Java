import java.util.*;
public class itemsbill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser ;
        System.out.println(total);

        // float total_amount = (total * 18)/100;
        // GST Amount = (Selling Price x GST Rate) / 100
        // float total_amount = total * 0.18f;
        float newTotal = total + (0.18f *total);

        System.out.println(newTotal);
        sc.close();
        
    }
    
}
