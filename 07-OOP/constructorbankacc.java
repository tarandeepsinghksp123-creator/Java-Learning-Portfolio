public class constructorbankacc {
    public static void main(String[] args) {
        bankaccount b1 = new bankaccount("Taran",1213821,50000);
        bankaccount b2 = new bankaccount("rahul",1239848,20000);
        b1.deposit(10000);
        b2.deposit(209);

        b1.displaybalance();
        b2.displaybalance();

    }

}

class bankaccount {
    String accountHolder;
    long accountNumber;
    double balance;

    bankaccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("invalid deposit amount");
        }
    }
    void displaybalance (){
        System.out.println(balance);
    }
}
