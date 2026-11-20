import java.util.*;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        if (num > 80) {
            System.out.println("you are very old");

        }
        if (num > 60) {
            System.out.println("you are old");
        }
        if (num > 40) {
            System.out.println("you are becoming old");
        }
        if (num > 20) {
            System.out.println("you are adult");
        } else {
            System.out.println("you are child");
        }

    }
}
