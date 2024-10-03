public class Super_Keyword
{
    public static void main(String[] args)
    {
        B obj=new B(10);
        obj.equals(obj);
    }
}

class A extends Object
{ 
    public A()
    {
        super(); // This super keyword is will be in all the constructor hidden
        System.out.println("In A");
    }
    public A(int n)
    {
        super();
        System.out.println("In A int");
    }
}

class B extends A
{
    public B()
    {
        super();
        System.out.println("In B");
    }
    public B(int n)
    {
        // super(n);
        this();
        System.out.println("In B int");
    }
}
