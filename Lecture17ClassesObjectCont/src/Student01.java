// Creation of Object
public class Student01 {
     public int id;
     public int age;
     public String name;
     public  int nos;
     // Encapsulation
     private String gf;

     public String getGf() {
         return this.gf;
     }
     // Default Constructor
    public Student01(){
        System.out.println("Student Default Constructor.");
    }

     // Parameterised constructor
     public Student01(int id, int age, String name, int nos, String gf) {
         System.out.println("Student Parameterised Constructor.");
         this.id = id;
         if(age < 100){
             this.age = age;
         }else{
             System.out.println("Invalid Age! Enter < 100");
         }
         this.name = name;
         this.nos = nos;
         this.gf = gf;
     }

     // Copy Constructor
     public Student01(Student01 srcObj) {
         System.out.println("Student Copy Constructor.");
         this.id = srcObj.id;
         this.age = srcObj.age;
         this.name = srcObj.name;
         this.nos = srcObj.nos;
     }

     // Methods/Behaviours
    public void study(){
        System.out.println(name + " Studying");
    }

    public void sleep(){
        System.out.println(name + " Sleeping");
    }

    public void eat(){
        System.out.println(name + " Eating");
    }

    private void gfChatting(){
        System.out.println(name + " GF Chatting");
    }
}
