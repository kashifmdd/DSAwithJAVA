import java.util.Scanner;

public class numRightAngleTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value: ");
        int n =  input.nextInt();
//      Q1.
//        for(int r=1; r<=n; r++){
//            for(int c=1; c<=r; c++){
//                System.out.print(c+" ");
//            }
//            System.out.println();
//        }
//        Q2.
//        int count = 1;
//        for(int r=1; r<=n; r++){
//            for(int c=1; c<=r; c++){
//                System.out.print(count+" ");
//                count++;
//            }
//            System.out.println();
//        }
//        Q3. Char printing
//        for(int r=1; r<=n; r++){
//            for(int c=1; c<=r; c++){
//                int ans = (c + 'A' - 1);
//                System.out.print((char)ans+" ");
//            }
//            System.out.println();
//        }
//        Q4.
            for(int r=1; r<=n; r++){
                for(int c=1; c<=r; c++){
                    System.out.print((char)(n-c+'A')+" ");
                }
                System.out.println();
            }
    }

}
