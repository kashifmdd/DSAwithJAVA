//abstract class Bird{
//    abstract void fly();
//    abstract void eat();
//}
//
//class Sparrow extends Bird{
//    @Override
//    void fly() {
//        System.out.println("Sparrow flying");
//    }
//    @Override
//    void eat(){
//        System.out.println("Sparrow eating");
//    }
//}
//
//class Crow extends Bird{
//    @Override
//    void fly() {
//        System.out.println("Crow flying 2");
//    }
//    @Override
//    void eat(){
//        System.out.println("Crow eating");
//    }
//}
//
//public class Main {
//    public static void doBirdStuff(Bird b){
//        b.fly();
//        b.eat();
//        b.fly();
//        b.eat();b.fly();
//        b.eat();b.fly();
//        b.eat();
//        b.fly();
//        b.eat();
//        b.fly();
//        b.eat();
//
//
//
//    }
//    public static void main(String[]args){
//        doBirdStuff(new Sparrow());
//        doBirdStuff(new Crow());
//    }
//}

// Interfaces-----
interface Bird{
    void fly();
    void eat();
}

class Sparrow implements Bird{
    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }
    @Override
    public void eat(){
        System.out.println("Sparrow eating");
    }
}

class Crow implements Bird{
    @Override
    public void fly() {
        System.out.println("Crow flying 2");
    }
    @Override
    public void eat(){
        System.out.println("Crow eating");
    }
}

public class Main {
    public static void doBirdStuff(Bird b){
        b.fly();
        b.eat();
        b.fly();
        b.eat();b.fly();
        b.eat();b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();



    }
    public static void main(String[]args){
        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());
    }
}

