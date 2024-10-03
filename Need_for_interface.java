public class Need_for_interface
{
    public static void main(String[] args)
    {
        Developer anees=new Developer();

        Computer lap=new Laptop();
        Computer desk=new Desktop();

        anees.devApp(lap);
        anees.devApp(desk);
    }
}

class Developer
{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}

class Laptop extends Computer
{
    public void code()
    {
        System.out.println("code,complie,run");
    }
}

class Desktop extends Computer
{
    public void code()
    {
        System.out.println("code,complie,run : faster");
    }
}


abstract class Computer
{
    public abstract void code();
}