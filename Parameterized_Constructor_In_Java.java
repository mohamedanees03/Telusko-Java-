public class Parameterized_Constructor_In_Java {
    public static void main(String[] args) {
        Human obj=new Human(5,"anees");
        System.out.println(obj.age+":"+obj.name);
    }
}

class Human{
    int age;
    String name;

    public Human(){ // This is default constructor
        System.out.println("default !!");
    }
    public Human(int age) {
        this.age = age;
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(int a,String n){  // this is parameterized constructor
        age=a; 
        name=n;
    }
}