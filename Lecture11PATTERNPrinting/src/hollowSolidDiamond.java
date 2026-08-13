import java.util.Scanner;

public class hollowSolidDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();
        // upper pyramid
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n - r; c++) {
                System.out.print("  ");
            }
            for (int c = 1; c <= 2 * r - 1; c++) {
                if(c==1||c==2*r-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
//        invertedPyramid
        for (int r = 1; r <= n; r++) {
            if(r==1) continue;
            for (int c = 1; c <= r - 1; c++) {
                System.out.print("  ");
            }
            for (int c = 1; c <= 2 * n - 2 * r + 1; c++) {
                if(c==1||c==2*n-2*r+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
