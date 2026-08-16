public class StringBasics01 {
    public static void main(String[] args) {
//        String firstName = "Md";
//        String lastName = "Kashif";
//        System.out.println(firstName +" "+ lastName);
//        System.out.println(firstName.length());
//        System.out.println(firstName.charAt(1));

        // Comparing String
        String str1 = "Hello";
//        String str2 = "Hello";
        String str3 = "HELLO";

//        if(str1 == str2)      // Equal because str1 and str2 both refer "Hello" same values (String Pooling)
//        if(str1.equals(str3))     // "Both strings are not equal" because .equals is case-sensitive
        if(str1.equalsIgnoreCase(str3))
        {
            System.out.println("Both strings are equal");
        }else{
            System.out.println("Both strings are not equal");
        }
    }
}
