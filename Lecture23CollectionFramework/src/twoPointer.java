import java.util.Arrays;

public class twoPointer {
    public static void main(String[]args){
        int[] arr = {1,1,2,2,3};
        int n = arr.length;

        int u = 0;
        int res = 1;
        int c = 1;

        while(c<n){
            if(arr[c]==arr[c-1]){
                c++;
                continue;
            }
            arr[u++]=arr[c];
            u++;
            res++;
            c++;
        }
        System.out.print(res);
    }
}
