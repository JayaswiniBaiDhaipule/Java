
import java.util.Scanner;

public class Seventhclass {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // Strings

        // Decleration
        String name = "Tony";
        String fullNames = "Tony Stark";
        System.out.println(name);

        System.out.println(fullNames);

        // User Input

        Scanner sc = new Scanner(System.in);
        String myName = sc.nextLine();
        System.out.println("My Name is " + myName);

        // concatenation

        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + " " +  lastName;
        System.out.println(fullName);

        System.out.println(fullName.length());

        for(int i=0;i<fullName.length();i++){
        System.out.println(fullName.charAt(i));
        }

        String name1 = "Tony";
        String name2 = "Tony";

        // 1 s1 > s2 : +ve value
        // 2 s1 == s2 : 0
        // 3 s1 < s2 : -ve value

        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(name1 == name2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

         // Do not work in some cases so we use compareTo()
       

         if(new String("Tony") == new String("Tony")){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        // Substring 

        String sentence = "My name is Tony";
        String names = sentence.substring(11,sentence.length());
        System.out.println(names);


        // Strings are Immutable

        // Ṣtrings are objects in Java

        sc.close();
    }
    
}
