import java.util.Scanner;

public class BasicMaths01 {
    // Print digit
    static int printDigits(int num) {
        while (num != 0) {
            System.out.print(num % 10);
            // for remove last digit
            num /= 10;
        }
        return num;
    }

    // count digit
    static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            count++;
            num /= 10;
        }
        return count;
    }

    // sum of digits
    static int sumDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }

    // isPalindrome incompleted ----,,,
//    static boolean palindrome(int num){
//        int originalNum = num;
//        int reversedNum = printDigits(num);
//        if(originalNum == reversedNum){
//            System.out.println("It is a palindrome");
//            return true;
//        }else{
//            System.out.println("It is not a palindrome");
//            return false;
//        }
//    }

    // Prime Number or Not
    static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // gcd find Hcf
    static int getGCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // lcm
    static int getLCM(int a, int b){
        int gcd = getGCD(a, b);
        int prod = a*b;
        int lcm = prod/gcd;
        return lcm;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number: ");
//        int num = sc.nextInt();
//        int ans = printDigits(num);
//        System.out.println(countDigits(num));
//        System.out.println(sumDigits(num));
//        boolean ans = palindrome(num);
//        System.out.println(ans);
//        System.out.println(isPrime(num));
        System.out.println(getLCM(18,12));
    }
}
