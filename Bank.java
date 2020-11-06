public class Bank {
    private String owner = "David ";
    private int created = 2000;
    private double amount = 10000;

    public Bank(String owner, double amount, int created) {
        this.owner = owner;
        this.amount = amount;
        this.created = created;

    }

    public void withdraw(double withdraw) {
        amount = amount - withdraw;
        System.out.println(withdraw);

    }

    public void deposit(double deposit) {
        amount = amount + deposit;
        System.out.println(deposit);

    }

    public void clear(double clear) {
        amount = 0;
        System.out.println(clear);

    }
    public static void main(String[] args) {
        Bank newbank = new Bank("David", 10000000, 2005);
    }
}