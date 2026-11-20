import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a ");
        int a = sc.nextInt();

        System.out.println("enter b");
        int b = sc.nextInt();

        int hcf = 1;
        int i = 1;
        while (i <= a && i <= b) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;

            }
            i++;
        }
        System.out.println(hcf);
    }
}
