
package pac1;

public class lab2_1 {
    public static void main(String[] args) {
        Person1 smith = new Person1("Smith", "");
        Person1 kathy = new Person1("Kathy", "");

        Account smithAccount = new SavingsAccount(smith, 2000.0);
        Account kathyAccount = new CurrentAccount(kathy, 3000.0, 2000.0);

        smithAccount.deposit(2000.0);
        kathyAccount.withdraw(2000.0);

        System.out.println("Updated Balances:");
        System.out.println(smithAccount);
        System.out.println(kathyAccount);

        System.out.println("Smith Balance (INR): " + String.format("%.2f", smithAccount.getBalance()));
        System.out.println("Kathy Balance (INR): " + String.format("%.2f", kathyAccount.getBalance()));
    }
}


