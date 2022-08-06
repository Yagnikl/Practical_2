import java.util.Date;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate = 7;
    private Date dateCreated = new Date();

    public Account() {

        balance = 500;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    void withdraw(double amo) {
        if (balance - amo > 300) {
            balance = balance - amo;
            System.out.println(amo + " is debited from your Account");
        } else
            System.out.println("Balance is not sufficient");
    }

    void deposit(double amo) {
        balance += amo;
        System.out.println(amo + " is credited to your Account");
    }

    void MoneyTransfer(double amo, Account ac) {
        double r = this.balance - amo;
        if (r < 300)
            System.out.println("Balance is not sufficient");
        else {
            this.balance = r;
            ac.balance += amo;
        }
    }
    void BalanceInquiry() {
        System.out.println("Balance in account is " + balance);
    }
}