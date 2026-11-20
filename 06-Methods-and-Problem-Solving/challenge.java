import java.util.Scanner;

public class challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        int largest = -1;
        int secondlargest = -1;

        // for (int i = 1; i <= n; i++) {
        //     if (n % i == 0) {
        //         System.out.println(i);
        //     }
        // }

        // int count =0 ;
        // for ( int i =1;i<=n;i++){
        //     if (n%i==0){
        //         count ++;
        //     }

        // }
        // System.out.println(count);

        while (n!=0){
            int digit = n % 10 ;
            if (digit > largest) {
                secondlargest=largest;
                largest = digit ;

            }else if (digit > secondlargest && digit != largest){
                secondlargest=digit;
            }
            n= n /10;
            
        }
        System.out.println(secondlargest);



    }

}
