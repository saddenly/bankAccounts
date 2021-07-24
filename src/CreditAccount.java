public class CreditAccount extends Account {
    public CreditAccount(int balance, String accountName) {
        super(balance, accountName);
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (balance < amount) {
            System.out.println("Недостаточно средств для совершения перевода");
            return false;
        }

        if (!account.addMoney(amount)) {
            System.out.println("Перевод с: " + accountName + " на " + account + " не удался");
            return false;
        }

        balance -= amount;
        account.balance += amount;
        System.out.println("Совершен перевод с: " + accountName + " на " + account + " - " + amount + " y.e");
        return true;
    }

    @Override
    public boolean addMoney(int money) {
        if (money >= Math.abs(getBalance())) {
            balance = Math.abs(balance);
            System.out.println("Кредит погашен!");
            return true;
        } else {
            balance += money;
            System.out.println("Пополнение на сумму в " + money + " успешно проведено!");
            return false;
        }
    }

    @Override
    public boolean pay(int amount) {
        balance -= amount;
        System.out.println("Оплата в " + amount + " успешно проведена!");
        return true;
    }
}