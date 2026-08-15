import java.util.Scanner;

public class inputIn2DArray07 {
    public static void main(String[] args) {
        int arr [][] = new int[2][3];
        Scanner sc = new Scanner(System.in);
        for(int r=0; r<arr.length; r++){
            for(int c=0; c<arr[r].length; c++){
                System.out.print("Enter Row Value: "+ r +" And Column Value:"+ c+" ");
                arr[r][c] = sc.nextInt();

            }
        }
        for(int r=0; r<arr.length; r++){
            for(int c=0; c<arr[r].length; c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }
    }
}
