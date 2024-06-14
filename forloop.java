public class forloop {
    public static void main(String[] args) {
        // for(int n = 1;n<=10;n++){
        //     System.out.println(n);
        // }

        // for(int n = 1;n<=4;n++){
        //     System.out.println("****");
        // }

        int reverse = 0;
        int  num = 12345;
        for(;num != 0;num=num/10 ){
        int n =  num % 10;
        reverse = reverse * 10+ n;
       
        }
        System.out.println(reverse);
        }
    }
    
