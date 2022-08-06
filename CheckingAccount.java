public class CheckingAccount extends Account {
    double overDraft = -1000;

    public CheckingAccount(int newId, double newBalance) {
        super(newId, newBalance);
    }

    public void checking(double i) {

        double balance = getBalance();
        if (balance - i < overDraft){
            System.out.println("Failure: Can't overdraft more than            Rs1,000. A 50 ruppes +"
                    + "overdraft fee will be issued to your account. ");
            balance = balance - 50; }
        else
            balance = balance - i;
    }
}