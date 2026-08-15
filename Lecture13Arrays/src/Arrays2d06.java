public class Arrays2d06 {
    public static void main(String[] args) {
//        int brr [][] = {
//                {1,2},
//                {2,3},
//                {3,4},
//                {4,5},
//        };
//        for(int r=0;r<brr.length;r++){
//            for(int c=0;c<brr[r].length;c++){
//                System.out.print(brr[r][c]+" ");
//            }
//            System.out.println();
//        }

        // Jagged 2D Array
        int [][] arr = {
                {2,3},
                {4,5,9},
                {6,7,8,1},
                {1},
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
