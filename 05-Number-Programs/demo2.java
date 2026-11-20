public class demo2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            int temp = i;
            int pow = 0;
            int sum = 0;

            while (temp != 0) {
                pow++;
                temp = temp / 10;
            }
            temp = i;

            while (temp != 0) {
                int digit = temp % 10;
                sum += (int)Math.pow(digit, pow);
                temp = temp / 10;
            }

            if (i == sum) {
                System.out.println(i);

            }
        }
    }
}
