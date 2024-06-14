import java.util.*;

public class Studentpassfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float marks = sc.nextFloat();

        String result = ((marks >= 33)?"PASS":"Fail");
        System.out.println(result);
        sc.close();
    }
    
}
