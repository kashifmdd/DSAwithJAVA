public class multiplyOfArray04 {
    static void main(){
        int arr[] = {10, 20, 40, 5};
        int multy = 1;
        for(int i=0; i<arr.length; i++ ){
            multy = multy * arr[i];
        }
        System.out.println(multy);
    }
}
