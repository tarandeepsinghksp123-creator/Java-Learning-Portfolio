import java.util.Scanner;

public class arraychallengeque {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Search a number");
        // int n = sc.nextInt();
        // boolean found = false;
        // int count = 0 ;
        // int[] arr = { 10, 20, 20 ,50 };
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == n) {
        //         found = true;
        //         count ++ ;

        //     }
        // }

        // if (found) {
        //     System.out.println("number exist  " +count);
        // } else {
        //     System.out.println("number does not exist");
        // }
        // int [] arr = {10,20,40};
        // int smallest = arr[0] ;
        // for (int i =0 ; i< arr.length ;i++){
        //     if (arr[i]<smallest){
        //         smallest = arr [i];
        //     }
             
            
        // }
        // int secondsmallest = Integer.MAX_VALUE;

        // for ( int i = 0 ;i<arr.length;i++){
        //     if (arr[i] < secondsmallest && arr[i]!=smallest){
        //         secondsmallest = arr[i];
        //     }
        // }
        // System.out.println("largest number" +smallest);
        // System.out.println("second smallest number" +secondsmallest);

        int [] arr = {10,20,40};
        int smallest = arr[0] ;
        for (int i =0 ; i< arr.length ;i++){
            if (arr[i]<smallest){
                smallest = arr [i];
            }
    }
    int largest = arr[0];
    for (int i = 0 ; i<arr.length;i++){
        if(arr[i]>largest){
            largest = arr [i];
        }
    }
    int diff = largest-smallest;
    System.out.println(diff);

}
}
