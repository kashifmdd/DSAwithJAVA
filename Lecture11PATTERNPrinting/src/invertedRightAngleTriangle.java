import java.util.Scanner;

public class invertedRightAngleTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num of Row: ");
        int n = sc.nextInt();

        for(int r=1; r<=n; r++){
            for(int c=1; c<=n-r+1; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
