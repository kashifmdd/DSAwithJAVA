import java.util.Scanner;

public class hollowTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = input.nextInt();

        for(int r=1; r<=n; r++){
            for(int c=1; c<=r; c++){
                if(r==1||r==2||r==n){
                    System.out.print("* ");
                }else{
                    if(c==1||c==r){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }

                }
            }
            System.out.println();
        }
    }
}
