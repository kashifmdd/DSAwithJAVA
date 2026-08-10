import java.util.Scanner;

public class solidSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers: ");
        int n = sc.nextInt();

//        for(int r=1; r<=n; r++){
//            for(int c=1; c<=n; c++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        // Solid Rectangular Pattern
        for(int r=1; r<=n; r++){
            for(int c=1; c<=5; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
