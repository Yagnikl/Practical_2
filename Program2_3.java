/* ID - 21CE062  Yagnik Ladani
Aim :
Use the Account class created as above to simulate an ATM machine.
Create 10 accounts with id AC001…..AC010 with initial balance 300₹. The
system prompts the users to enter an id. If the id is entered incorrectly, ask
the user to enter a correct id. Once an id is accepted, display menu with
multiple choices.
1. Balance inquiry
2. Withdraw money [Maintain minimum balance 300₹]
3. Deposit money
4. Money Transfer
5. Create Account
6. Deactivate Account
7. Exit
*/
import java.util.*;

public class Program2_3 {
    static int getAccount() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Account Number : ");
            int ac_no = sc.nextInt();
            if (ac_no > 0 && ac_no < 11) {
                ac_no--;
                return ac_no;
            }
            System.out.println("Account number is wrong plz enter proper account no");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account[] ac = new Account[10];
        ArrayList<Account> a = new ArrayList<Account>();
        int i;
        for (i = 0; i < 10; i++) {
            ac[i] = new Account(i + 1, 300);
            a.add(ac[i]);
        }
        int ac_no;
        System.out.print("""
                1. Balance inquiry\s
                2. Withdraw money\s
                3. Deposit money\r
                4. Money Transfer\r
                5. Create Account\r
                6. Deactivate Account\r
                7. Exit\s
                Enter your Choice :\r""");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                ac_no=getAccount();
                a.get(ac_no).BalanceInquiry();
                break;
            case 2:
                ac_no=getAccount();
                int amo;
                System.out.println("Enter amount want to withdraw : ");
                amo = sc.nextInt();
                a.get(ac_no).withdraw(amo);
                break;
            case 3:
                ac_no=getAccount();
                int amo2;
                System.out.println("Enter amount want to Deposit : ");
                amo2 = sc.nextInt();
                a.get(ac_no).deposit(amo2);
                break;
            case 4:
                int amo3;
                ac_no = getAccount();
                System.out.println("Enter amount want to Transfer : ");
                amo3 = sc.nextInt();
                System.out.println("Enter account no : ");
                int ac_no2 = sc.nextInt();
                if (ac_no2 > 0 && ac_no2 < 11) {
                    ac_no2--;
                    a.get(ac_no).MoneyTransfer(amo3, a.get(ac_no2));
                }
                else
                    System.out.println("Account number is wrong plz enter proper account no");
            case 5:
                System.out.println("Enter amount you want to deposit & minimum 300 required :");
                int amo4 = sc.nextInt();
                Account anew = new Account(i + 1, amo4);
                a.add(anew);
                System.out.println("Your account number is "+ (i+1));
                a.get(i).BalanceInquiry();
                break;
            case 6 :
                ac_no = getAccount();
                a.remove(ac_no);
                System.out.println("Your account is removed successfully");
                break;
            case 7 :
                System.out.println("Thanks for visiting ");
            default:
                break;
        }
        sc.close();
    }
}

