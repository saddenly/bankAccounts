public class Main {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount(100_000, "card owner's name");
        Account acc2 = new CreditAccount(-100_000, "card owner's name");
        Account acc3 = new CheckingAccount(100_000, "card owner's name");

        acc1.pay(10);
        acc1.transfer(acc2, 10_000);
        acc1.addMoney(10_000);

        acc2.pay(15_000);
        acc2.transfer(acc3, 10_000);
        acc2.addMoney(150_000);

        acc3.pay(15_000);
        acc3.transfer(acc1, 50_000);
        acc3.addMoney(35_000);
    }
}