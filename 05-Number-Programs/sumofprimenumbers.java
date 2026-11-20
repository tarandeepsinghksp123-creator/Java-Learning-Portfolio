import java.util.Scanner;

public class sumofprimenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the vallue of n");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                
                if (i % j == 0) {
                    prime = false;
                    break;

                }
            }
            if (prime) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
