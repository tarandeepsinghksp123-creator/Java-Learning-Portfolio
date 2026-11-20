import java.util.Scanner;

public class taran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        int original = n;
        int temp = n;
        int sum = 0;
        int pow = 0;
        while (n > 0) {
            pow ++ ;
            n = n / 10;
        }
        while (temp != 0) {
            
            int digit = temp % 10;
            sum += Math.pow(digit, pow);
            temp = temp / 10;

        }
        if (original == sum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();

    }

}
