public class maxNumInArray05 {
    public static void main(String[] args) {
        int num[] = {23,54,65,88,33,45,32,56,66,12,-5};
//        Find Max value
//        int max = num[0];
//        for(int i=0; i<num.length; i++){
//            if(num[i]>max) {
//                max = num[i];
//            }
//        }
//        System.out.println("The max number is "+max);
//        Find Min Value
        int min = num[0];
        for(int i=0; i<num.length; i++){
            if(num[i]<min){
                min = num[i];
            }
        }
        System.out.println("The Min value is "+min);
    }
}