public class arrays {
    public static void main(String[] args) {
        // int[] arr = { 10, 20, 21, 40, 70 };
        // boolean sorted = true;
        // for (int i = 0; i < arr.length - 1; i++) {
        // if (arr[i] > arr[i + 1]) {
        // sorted = false;
        // break;
        // }
        // }
        // if (sorted) {
        // System.out.println("array is sorted");
        // } else {
        // System.out.println("not");
        // }
        // int[] arr = { 1, 2, 3, 5, 6,7};
        // int n = 7;
        // int expectedsum = (n*(n + 1)) / 2;
        // int actualsum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     actualsum += arr[i];
        // }
        // int missingnum = expectedsum - actualsum;
        // System.out.println(missingnum);
        int [] arr = {0 ,2,2,0,5,0,1};
        int index = 0;
        for ( int i =0 ;i < arr.length;i++){
            if (arr[i]!=0){
                arr[index]=arr[i];
                index ++;
            }
        }
        while (index < arr.length) {
            arr[index] = 0 ;
            index++;
        }
        for ( int i =0 ; i< arr.length ;i++){
            System.out.println(arr[i]);
        }


    }
}