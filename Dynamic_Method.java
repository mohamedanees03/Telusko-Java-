public class Dynamic_Method
{
    public static void main(String[] args)
    {
        A obj=new A(); //  B obj=new B(); is equal to A obj=new B();
        obj.show();

        obj=new B();
        obj.show();

        obj=new C();
        obj.show();
    }
}

class A
{
    void show()
    {
        System.out.println("In A Show");
    }
}
 
class B extends A
{
    void show()
    {
        System.out.println("In B show");
    }
}

class C extends A
{
    void show()
    {
        System.out.println("In C show");
    }
}
