public class sumOf2dArrays08 {
    public static void main(String[] args) {
        int arr[][] = {{2,4,3}, {5,7,4}};
//        int sum = 0;
        int mul = 1;
        for(int r=0; r<arr.length; r++){
            for(int c=0; c<arr[r].length; c++){
//                sum += arr[r][c];
                mul = mul*arr[r][c];
            }
        }
//        System.out.println(sum);
        System.out.println(mul);
    }
}
