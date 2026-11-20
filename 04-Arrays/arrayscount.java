public class arrayscount {
    public static void main(String[] args) {
        int [] arr = { 10 , 15 , 20 , 30 , 40 ,55};
        int evencount = 0 ;
        int oddcount = 0;
        for (int i = 0 ; i < arr.length ;i++){
            if (arr[i] % 2 == 0){
                evencount ++;
                
            }else {
                oddcount ++;
                
            }
        }
        System.out.println("print even numbers = " +oddcount);
        System.out.println("print odd numbers =" +evencount);
    }
    
}
