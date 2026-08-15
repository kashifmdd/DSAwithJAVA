import java.util.Scanner;

public class arrayInput02 {
    static void main(){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            System.out.println("Provide input of index "+i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Your Array contains: ");
        for(int val: arr){
            System.out.println(val);
        }
    }
}
