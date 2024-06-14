import java.util.*;


public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float pi = 3.14f;
        float radius = sc.nextFloat();
        double area = pi* radius *radius ;
        System.out.println(area);
        sc.close();
    }
    
}
