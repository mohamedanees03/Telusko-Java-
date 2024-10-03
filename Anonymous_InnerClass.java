public class Anonymous_InnerClass {
    public static void main(String[] args) {
        A obj=new A(){
            public void show(){
                System.out.println("In main class");
            }
        };
        obj.show();
    }
}

class A{
    public void show(){
        System.out.println("In A show");
    }
}
