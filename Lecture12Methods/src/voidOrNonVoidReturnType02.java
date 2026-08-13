public class voidOrNonVoidReturnType02 {
    // void Return type ---
    static void Sum(int a, int b){
        int sum = a + b;
        System.out.println(sum);
        return;     // there is no sense to write return type here.
    }
    // Non-Void return Type
    static int Add(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
//        Sum(1,2);

//        int result = Add(2,2);
//        System.out.println(result);
        System.out.println(Add(1,2));   // also write like this
    }
}
