package classesAndObjects.task8;

public class Test {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456789", "John Smith", 1000);

        System.out.println("Current balance of account1: " + account1.getBalance());
        account1.deposit(500.0);
        System.out.println("Current balance of account1: " + account1.getBalance());
        account1.withdraw(200.0);
        System.out.println("Current balance of account1: " + account1.getBalance());
    }

}
