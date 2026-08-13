public class methodOverloading03 {
    // Same Methods Name(Method Overloading)
    static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
//    static int add(int a, int b, int c){
//        int sum = a + b + c;
//        return sum;
//    }
        static float add(int a, int b, int c){
//            float sum = a + b + c;
            return a + b + c;
        }

    public static void main(String[] args) {
        int ans1 = add(1,2);
//        float ans2 = add(3,4,5);
        System.out.println(ans1);
        System.out.println(add(3,4,5));
    }
}
