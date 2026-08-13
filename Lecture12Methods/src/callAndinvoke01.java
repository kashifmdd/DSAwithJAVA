import java.util.Scanner;

public class callAndinvoke01 {
    // declaration/definition a method
    // because main method is static so user declared method also define static method
    // this is a parameters methods
    static void printTable(int n){
        for(int i=1; i<=10; i++){
            int table = n*i;
            System.out.println(n+" "+"*"+" "+i+" -> "+table);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Table: ");
        int n = input.nextInt();
        // Method Call ---
        printTable(n);
    }
}
