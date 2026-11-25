import java.util.Scanner;

public class pallindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        if (s.equals(reverse)) {
            System.out.println("String is pallindrome");
        } else {
            System.out.println("String is not pallindrome");
        }
    }
}
