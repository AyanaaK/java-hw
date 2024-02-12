package classesAndObjects.task8;

// Создайте класс, представляющий собой банковский счет.
// У счета должны быть поля для номера счета, имени владельца и баланса.
// Напишите методы для снятия и внесения денег на счет, а также для получения текущего баланса.
// Создайте объекты класса банковский счет и проверьте работу методов.

public class BankAccount {
    private String accountNumber;
    private String accountOwnerName;
    private double balance;

    public BankAccount(String accountNumber, String accountOwnerName, double balance) {
        this.accountNumber = accountNumber;
        this.accountOwnerName = accountOwnerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Error");
        }
    }

    public double getBalance() {
        return balance;
    }
}
