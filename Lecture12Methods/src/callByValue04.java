public class callByValue04 {
    static void solve(int num){
        System.out.println("inside solve : "+num);
        num = num * 10;
        System.out.println("inside solve : "+num);
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println("inside Main : "+num);
        solve(num);     // call by value. that is created num copy for solve method
        System.out.println("inside Main : "+num);   // print 5 because gives there on main num value not solve num value.
    }
}
