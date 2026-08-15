public class arrayCreation01 {
    static void main(){
        // declaration
        int arr[];
        // allocation
        arr = new int[5];
        // initialisation
        int brr[] = {10,20,30};
//        System.out.println("Value of 0 index: "+ brr[0]);

        int n = brr.length;
//        for(int index = 0; index <= n-1; index++){
//            System.out.println(brr[index]);
//        for each loop
        for(int val: brr){
            System.out.println(val);
        }
    }
}
