package Classes;

import Interfaces.*;

public class FixedAccount extends Bank implements Operation {
    public FixedAccount(String CustomerName, String AccountNumber, double Balance) {
        super(CustomerName, AccountNumber, Balance);
    }

    @Override
    public double Interest() {
        return getBalance() * 0.10;
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
        System.out.println("Fixed Account Interest: " + Interest());
    }
}
