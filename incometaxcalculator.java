import java.util.*;

public class incometaxcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double income = sc.nextFloat();
        double tax;

        if(income < 500000){
            tax = 0;
            System.out.println("0% tax");
            System.out.println("tax amount is "+ tax);
        }else if(income >= 500000 && income <= 1000000){
            System.out.println("20% tax");
            tax = income * 0.2;
            System.out.println("tax amount is " + tax);
        }else if(income >= 1000000){
            System.out.println("30% tax");
            tax = income *0.3;
            System.out.println("tax amount is " + tax);
        }
        sc.close();
    }
}
