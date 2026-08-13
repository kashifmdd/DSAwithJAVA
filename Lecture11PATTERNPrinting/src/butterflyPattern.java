import java.util.Scanner;

public class butterflyPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Value: ");
        int n = input.nextInt();

        //Upper part
        for(int r=1; r<=n; r++){
            // Righr Angle Triangle
            for(int c=1; c<=r; c++){
                System.out.print("* ");
            }
            // inverter solid pyramid for print Space
            for(int c=1; c<=2*n-2*r; c++) {
                System.out.print("  ");
            }
            // left angle traingel
            for(int c=1; c<=r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower part
        for(int r=1; r<=n; r++){
            // inverted right angle triangle
            for(int c=1; c<=n-r+1; c++){
                System.out.print("* ");
            }
            // solid pyramid
            for(int c=1; c<=2*r-2; c++){
                System.out.print("  ");
            }
            // inverted left triangle
            for(int c=1; c<=n-r+1; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
