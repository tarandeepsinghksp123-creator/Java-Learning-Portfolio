import java.util.Scanner;

public class akarshanproblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter salary");
        int num = sc.nextInt();
        double tax = 0;
        if (num < 400000) {
            tax = 0;
        }

        else if (num >= 400000 && num <= 800000) {
            tax = (num * 0.05);

        } else if (num >= 800001 && num <= 1200000) {
            tax = (400000 * 0.05) + (num - 800000) * 0.10;
        } else if (num >= 1200001 && num <= 1600000) {
            tax = (400000 * 0.05) + (400000 * 0.10) + (num - 1200000) * 0.15;

        } else if (num >= 1600001 && num <= 2000000) {
            tax = (400000 * 0.005) + (400000 * 0.10) + (400000 * 0.15) + (num - 160000) * 0.20;
        } else if (num >= 2000001 && num <= 2400000) {
            tax = (400000 * 0.005) + (400000 * 0.10) + (400000 * 0.15) + (400000 * 0.20) + (num - 2000000) * 0.25;
        } else if (num >= 2400001) {
            tax = (400000 * 0.005) + (400000 * 0.10) + (400000 * 0.15) + (400000 * 0.20) + (num - 2400000) * 0.30;
        }
        System.out.println(tax);

    }
}
