import java.util.Scanner;

public class Loopss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int sum=0;
        // int i = 2;
        // System.out.println("print table of 2");
        // // while(i <= 20){
        // // System.out.println(i);
        // // i+=2 ;
        // // }
        // do {
        // System.out.println(i);
        // i+=2;
        // } while (i <= 20);
        // for (int i = 5 ; i >= 1 ; i--){
        // for (int j = 1; j <= i; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // for (int i = 1; i <= 50; i++) {
        // if (i % 2 == 0) {
        // System.out.println(i);

        // }
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("sum : " + sum);

    }
}
