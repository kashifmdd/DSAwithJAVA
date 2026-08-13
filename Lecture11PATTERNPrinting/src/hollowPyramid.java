import java.util.Scanner;

public class hollowPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num of Row: ");
        int n = sc.nextInt();

        for(int r=1; r<=n; r++){
            for(int c=1; c<=n-r; c++){
                System.out.print("  ");
            }
            // method 1
//            for(int c=1; c<=r; c++){
//                System.out.print("* ");
//            }
//            for(int c=1; c<=r-1; c++){
//                System.out.print("* ");
//            }
            //method 2
            for(int c=1; c<=2*r-1; c++){
                if(c==1||c==2*r-1||r==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
