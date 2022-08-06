/* ID - 21CE062  Yagnik Ladani
Aim  : Develop a Program that illustrate method overloading concept.
 */
import java.util.Scanner;

public class Program2_5 {
    public static void main(String[] args) {
        int rol;
        long mobi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roll No");
        rol = sc.nextInt();
        System.out.println("Enter the Name");
        String name = sc.next();
        System.out.println("Enter the Mobile No");
        mobi = sc.nextLong();

        Data();
        Data(rol);
        Data(rol, name);
        Data(rol, name, mobi);
    }

    static void Data() {
        System.out.println("You need to Enter the details");
        System.out.println();
    }

    static void Data(int rn) {
        System.out.println("1. Roll No is " + rn);
        System.out.println();
    }

    static void Data(int rn, String name) {
        System.out.println("1. Roll No is " + rn);
        System.out.println("2. Name is " + name);
        System.out.println();
    }

    static void Data(int rn, String name, long mo) {
        System.out.println("1. Roll No is " + rn);
        System.out.println("2. Name is " + name);
        System.out.println("3. Mobile Number is " + mo);
        System.out.println();
    }
}
