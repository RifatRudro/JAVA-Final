package Classes;

public abstract class Bank {
    protected String CustomerName;
    protected String AccountNumber;
    protected double Balance;

    public Bank(String CustomerName, String AccountNumber, double Balance) {
        this.CustomerName = CustomerName;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }

    public String getAccount() {
        return AccountNumber;
    }

    public String getCustomer() {
        return CustomerName;
    }

    public double getBalance() {
        return Balance;
    }

    public abstract double Interest();

    public void Display() {
        System.out.println("Customer Name: " + getCustomer());
        System.out.println("Account Number: " + getAccount());
        System.out.println("Balance: " + getBalance());
    }

}