public class App01 {
    public static void main(String[] args) {
        // Parameterised Constructor
        Student01 A = new Student01(101, 22, "Rahul", 5, "Tina");
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.nos);
        System.out.println(A.getGf());
//
        A.sleep();
        A.eat();
        A.study();
//        A.gfChatting();

//        Student01 B = new Student01(102, 33, "Bob", 5);
//        System.out.println(B.name + " " + B.nos + " " + B.name);
//        Student01 C = new Student01(103, 44, "John", 5);
//        System.out.println(C.name + " " + C.nos + " " + C.name);

        // Copy Constructor
//        Student01 B = new Student01(A);
//        System.out.println(B.name);
//        System.out.println(B.age);
//        System.out.println(B.id);
//        System.out.println(B.nos);
//
//        B.sleep();
    }
}
