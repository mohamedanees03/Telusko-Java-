public class Anonymous_Object {
    public static void main(String[] args) {
        new Computer().show(); // This is called anonymous object cause calling it without any object
    }
}

class Computer{
    Computer(){
        System.out.println("Default constructor");
    }
    void show(){
        System.out.println("In show method");
    }
}
