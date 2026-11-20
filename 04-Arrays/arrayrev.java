public class arrayrev {
    public static void main(String[] args) {
        int[] arr = { 234,532 ,6435};

        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int rev = 0;
            while (n > 0) {

                int digit = n % 10;
                rev = rev * 10 + digit;
                n = n / 10;

            }
            System.out.println(rev);

        }

    }
}
