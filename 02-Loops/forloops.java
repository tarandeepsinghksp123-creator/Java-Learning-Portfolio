import java.util.Scanner;

public class forloops {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // System.out.println("print a number");
        // int n = sc.nextInt();
        // // int count = 0;
        // for (int i = 1; i <= n; i++) {
        // System.out.println(i * i);
        // // if (i % 5 == 0) {
        // // count++;
        // }

        // }
        // // System.out.println(+count);
        // // sc.close();
        // }
        // Scanner sc = new Scanner(System.in);
        // System.out.println("print the factorial");
        // int n = sc.nextInt();
        // int fact = 1;
        // for (int i = 1; i <= n; i++)
        // {
        // fact = fact * i;
        // }
        // System.out.println(+fact);
        Scanner sc = new Scanner(System.in);
        System.out.println("print a number");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(+sum);
    }
}
