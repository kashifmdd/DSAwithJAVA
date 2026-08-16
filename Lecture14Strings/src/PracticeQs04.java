public class PracticeQs04 {
    // Q3. Count vowels in a String
    static int getVowelsCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'  || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }

    // Q4. Reverse a String
    static String reverseString(String str) {
        String reverse = "";
        int n = str.length();
        for(int i=n-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }

    // Q5. Check String is a palindrome or not
    static boolean isPalindrome(String str) {
        String original = str;
        String reverse = reverseString(original);
        // compare
        for(int i=0; i<original.length(); i++){
            if(original.charAt(i) != reverse.charAt(i)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String str = "NOON";
//        System.out.println(getVowelsCount(str));
//        System.out.println(reverseString(str));
        System.out.println(isPalindrome(str));
        // Q1. Print each character of the String
        String name = "Kashif";
//        for(int i=0; i<name.length(); i++) {
//            System.out.println(name.charAt(i));
//        }

        // Q2. Count length of String without length()
//        int n = name;
//        for(int i=0; i<n;)

    }
}
