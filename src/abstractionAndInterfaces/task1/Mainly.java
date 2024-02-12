package abstractionAndInterfaces.task1;

import abstractionAndInterfaces.task1.Accounts.CheckingAccount;
import abstractionAndInterfaces.task1.Accounts.CreditAccount;
import abstractionAndInterfaces.task1.Accounts.SavingsAccount;

public class Mainly {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("Cберегательный счет", 1500);
//       savingsAccount.transfer(savingsAccount, 300);

        CreditAccount creditAccount = new CreditAccount("Кредитный счет", 0);
//       creditAccount.transfer(savingsAccount, 700);

        CheckingAccount checkingAccount = new CheckingAccount("Рассчетный счет", 500);
//        checkingAccount.pay(600);
        checkingAccount.transfer(creditAccount, 500);
    }
}
