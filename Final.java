// final - variable,class, method

public class Final
{
    public static void main(String[] args)
    {
        // final int num=3;
        // System.out.println(num);

        // Calc obj=new Calc();
        Advanced_Calc obj=new Advanced_Calc();
        obj.display();
        obj.add(4, 4);
    }    
}


// final class Calc -- When you are using final the inheritance in stopped.
class Calc
{
    // final void display()
    void display()
    {
        System.out.println("Im Saleem");
    }
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
}

class Advanced_Calc extends Calc
{
    public void display()
    {
        System.out.println("Im Anees");
    }
}
