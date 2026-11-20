import java.util.*;

public class akarshan {
    public static void main(String[] args) {
        // calculate x^n using loop
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int original = n ;
        int sum = 0;
        int temp = n;
        int pow = 0;

        while (n > 0) {
            pow += 1 ;
            n = n / 10;
        }
        // System.out.println(pow);

        while ( temp != 0) {
            int digit = temp % 10 ;
            sum += Math.pow(digit,pow);
            temp /= 10;
        }
        // System.out.println(sum);
        // System.out.println(original);
        
        if (sum == original){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
    }

}
