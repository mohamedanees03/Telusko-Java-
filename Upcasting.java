public class Upcasting
{
    public static void main(String[] args)
    {
        // double d=4.5;
        // int i=(int)d;
        // System.out.println(d);
        // System.out.println(i);

        A obj=new B();   // This is called as upcasting 
        obj.show1();

        B obj1=(B) obj; // This is called as Downcasting
        obj1.show2();

    }
}

class A
{
    void show1()
    {
        System.out.println("In A show");
    }
}

class B extends A
{
    void show2()
    {
        System.out.println("In B show");
    }
}
