import Classes.*;
import Interfaces.*;

public class Main {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("Rifat", "1231", 3600);
        FixedAccount f1 = new FixedAccount("Rifat", "1231", 3600);
        s1.Deposit(1230);
        s1.Withdraw(233);
        s1.Display();
        f1.Deposit(5000);
        f1.Withdraw(1000);
        f1.Display();
    }
}
