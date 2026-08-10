import java.util.Scanner;

public class invertedSolidPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = input.nextInt();

        for(int r=1; r<=n; r++){
            for(int c=1; c<=r-1; c++){
                System.out.print("  ");
            }
            for(int c=1; c<=2*n-2*r+1; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
