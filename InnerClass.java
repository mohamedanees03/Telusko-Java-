public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // A.B obj1=new A.B(); --> If B class is static
        A.B obj1 = obj.new B();
        obj1.config();
    }
}

class A {
    int age;

    public void show() {
        System.out.println("In A show");
    }

    class B {
        public void config() {
            System.out.println("In B config");
        }
    }
}