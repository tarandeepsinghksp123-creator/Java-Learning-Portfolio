import java.util.*;

public class practiceproblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what food will you choose =");
        System.out.println("1.Burger");
        System.out.println("2.Pizza");
        System.out.println("3.pasta");
        System.out.println("4.coffee");
        int food = sc.nextInt();

        
        System.out.println("quantity of choose item =");
        int quantity = sc.nextInt();
        int price;

        switch (food) {
            case 1:
                price = 120 * quantity;
                System.out.println("your price for burger is =" + price);
                break;
            case 2:
                price = 200 * quantity;
                System.out.println("your price for Pizza is =" + price);
                break;
            case 3:
                price = 150 * quantity;
                System.out.println("your price for Pasta is =" + price);
                break;
            case 4:
                price = 80 * quantity;
                System.out.println("your price for Coffee is =" + price);
                break;
            default:
                System.out.println("food not  available" );

        }
        sc.close();
    }

}
