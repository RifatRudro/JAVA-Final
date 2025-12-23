package Classes;

import Interfaces.*;

public class SavingsAccount extends Bank implements Operation {
    public SavingsAccount(String CustomerName, String AccountNumber, double Balance) {
        super(CustomerName, AccountNumber, Balance);
    }

    @Override
    public double Interest() {
        return getBalance() * 0.07;
    }

    public void Deposit(double Amount) {
        Balance += Amount;
        System.out.println("Amount: " + Amount + " Depositted");

    }

    public void Withdraw(double Amount) {
        if (Balance > Amount && Amount > 0) {
            Balance -= Amount;
            System.out.println("Amount: " + Amount + " Withdrawn");
        }
    }

    public void Display() {
        super.Display();
        System.out.println("Savings Account Interest: " + Interest());
    }
}
