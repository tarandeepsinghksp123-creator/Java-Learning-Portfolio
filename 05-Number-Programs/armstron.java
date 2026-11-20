import java.util.Scanner;

public class armstron{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();

        int original = n;
        int sum=0;
        int pow=0;
        int temp=n;
        
        while (n > 0){
            pow ++;
            n = n / 10 ;
            

        }
        System.out.println("power =" +pow);
        while ( temp != 0){
            int digit = temp % 10 ;
            sum += Math.pow(digit,pow);
            temp = temp / 10 ;

        }
        if(original==sum){
            System.out.println("number is armstrong");
        }else{
            System.out.println("number is not armstrong");
        }
    }
}