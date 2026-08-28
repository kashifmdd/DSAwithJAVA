public class Main {
    public static void main(String[]args){
//        MethodOverloading m = new MethodOverloading();
//        System.out.println(m.add(4,5));
//        System.out.println(m.add(8,3,2));
//        System.out.println(m.add(3,52,6,2));

//        Shape s = new Shape();
//        s.drow();
//        Circle c = new Circle();
//        c.drow();
//        Rectangle r = new Rectangle();
//        r.drow();

//        Circle c = new Circle();
//        doDrow(c);
////        Rectangle r = new Rectangle();
//        doDrow(new Rectangle());
//        doDrow(new Shape());

        // downcasting
        Circle c = new Circle();
        doDrow(c);
//        Rectangle r = new Rectangle();
//        doDrow(r);

    }

    // Upcasting
    public static void doDrow(Shape s){
        s.drow();   // Polymorphic

        Circle c = (Circle) s;
        c.personal();
    }

}
