import java.util.*;
public class whilelooponetohundred {
    public static void main(String[] args) {
 /*     int num = 1;
        while(num <=100){
            System.out.println(num);
            num++;
        }

        int num = 1;
        while(num <=10){
            System.out.println(num);
            num++;
        }
*/
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int num = 1;
int sum = 0;

// while(num <= n){
//     System.out.println(num);
//     num++;
// }
while(num <=n){
    sum = num + sum;
    // System.out.println(sum);
    num++;
}
System.out.println(sum);
sc.close();
    
    }
    
}
