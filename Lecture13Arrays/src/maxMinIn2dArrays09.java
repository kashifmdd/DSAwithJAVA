public class maxMinIn2dArrays09 {
    public static void main(String args[]) {
        int arr[][]={{33,45,22}, {35,44,42,55}};
        int max = 33;

        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                if(arr[r][c]>max){
                    max=arr[r][c];
                }
            }
        }
        System.out.println(max);
    }
}
