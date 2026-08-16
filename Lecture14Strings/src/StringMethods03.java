public class StringMethods03 {
    public static void main(String[] args) {
        // empty -> length = 0
        // blank -> empty or only space
        String str = "  ";
//        System.out.println(str.length());
//        System.out.println(str.isEmpty());
//        System.out.println(str.isBlank());

        // trim method
        String name = "  Kashif  ";
//        name = name.trim();
//        System.out.println(name.length());

        // Uppper & Lower Case
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());

        // substring
        String str1 = "My name is Md Kashif";
        // beginIndex -> 3 -> inclusive
        // endIndex -> 7 exclusive
//        System.out.println(str1.substring(3, 7));

        // contains
//        System.out.println(str1.contains("Md"));

        // value of
        int num =12324;
        String nStr = String.valueOf(num);
//        System.out.println(num+1);
//        System.out.println(nStr+1);

        // prefix & suffix (startWith & endWith)
//        System.out.println(str1.startsWith("My"));
//        System.out.println(str1.endsWith("kashif"));

        // toCharArray
        String name1 = "Kashif";
        char[] crr = name1.toCharArray();
        for(char ch: crr){
//            System.out.println("Value of char: "+ch);
        }

        // split
        String str2 = "My,name,is,Md,Kashif";
        for(String splitStr: str2.split(",")){
//            System.out.println(splitStr);
        }

        // replace
        String name2 = "bubbar";
        name2 = name2.replace("b","l");
        System.out.println(name2);
    }

}
