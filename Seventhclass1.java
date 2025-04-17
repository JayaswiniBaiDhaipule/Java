public class Seventhclass1 {

    public static void main(String[] args) {
        // String Builder

        // Declaration

        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // charAt(index)

        System.out.println(sb.charAt(0));

        // set char at index 0

       sb.setCharAt(0, 'P');
       System.out.println(sb);

    //    INSERT()

       sb.insert(0, 'S');
       System.out.println(sb);

    sb.insert(2, 'n');
    System.out.println(sb);

     //    delete()
     sb.delete(2, 3);
     System.out.println(sb);

    //  append()

     StringBuilder str = new StringBuilder("h");

     str.append('e');
     str.append('l');
     str.append('l');
     str.append('o');

     System.out.println(str);

    //  length()

    System.out.println(str.length());




    }
}