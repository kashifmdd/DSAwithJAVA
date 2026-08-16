import java.util.Scanner;

public class StringInput02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = sc.nextLine();    // Use sc.nextLine();
        System.out.println("Value of str1: " + str1);

        System.out.println("Enter a string2: ");
        String str2 = sc.next();       // Use sc.next();
        System.out.println("Value of str2: " + str2);
    }
}
