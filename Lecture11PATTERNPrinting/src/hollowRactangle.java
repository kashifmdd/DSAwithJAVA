import java.util.Scanner;

public class hollowRactangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = input.nextInt();

        for(int r = 1; r <= n; r++){
            for(int c = 1; c <= 6; c++){
                if(r == 1 || r == n){
                    System.out.print("* ");
                } else {
                    if(c == 1 || c == 6){
                        System.out.print("* ");
                    }else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
