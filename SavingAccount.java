public class SavingAccount extends Account{
    double overdraftLimit = 0;

    public SavingAccount(int newId, double newBalance) {
        super(newId, newBalance);
    }

    public void withdraw (double w) {
        double balance = getBalance();
        if (balance - w < overdraftLimit)
            System.out.println("Insufficient Funds");
        else
            balance = balance - w;
    }
}