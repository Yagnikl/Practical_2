/* ID - 21CE062  Yagnik Ladani
Aim : Design a class named Account that contains:
• A private int data field named id for the account (default 0).
• A private double data field named balance for the account (default 500₹).
• A private double data field named annualInterestRate that stores the current
interest rate (default 7%). Assume all accounts have the same interest rate.
• A private Date data field named dateCreated that stores the date when the
account was created.
• A no-arg constructor that creates a default account.
• A constructor that creates an account with the specified id and initial balance.
• The accessor and mutator methods for id, balance, and annualInterestRate.
• The accessor method for dateCreated.
• A method named getMonthlyInterestRate() that returns the monthly interest rate.
• A method named getMonthlyInterest() that returns the monthly interest.
• A method named withdraw that withdraws a specified amount from the account.
• A method named deposit that deposits a specified amount to the account.

 */
import java.util.Scanner;

public class Program2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account ac1 = new Account(5, 50000);
        System.out.println("id of account : " + ac1.getId());
        System.out.println("Balance in account : " + ac1.getBalance());
        System.out.println("Annual Interest rate of account : " + ac1.getAnnualInterestRate());
        System.out.println("Monthly Interest of account is : " + ac1.getMonthlyInterest());
        System.out.println("date of joining : " + ac1.getDateCreated());

        System.out.print("\nEnter Amount You want to withdraw from account : ");
        double amm = sc.nextDouble();
        ac1.withdraw(amm);
        System.out.println("Balance after withdraw amount is : " + ac1.getBalance());

        System.out.print("\nEnter Amount You want to deposit to account : ");
        double amm2 = sc.nextDouble();
        ac1.deposit(amm2);
        System.out.println("Balance after deposit amount is : " + ac1.getBalance());
    }
}