public class Abstract
{
    public static void main(String[] args)
    {
        Car obj=new UpdateAudi();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}

abstract class Car
{
    public abstract void drive();
    public abstract void fly();
    public void playMusic()
    {
        System.out.println("Music is Playing....");
    }
}

abstract class Audi extends Car
{
    public void drive()
    {
        System.out.println("Driving in Audi....");
    }
}

class UpdateAudi extends Audi   // This class is called as Concrete class
{
    public void fly()
    {
        System.out.println("Flying...");
    }
}


/*
    Points:
     1. Abstract class can also have normal method
     2. We cannot create the object of abstract class 
     3. The abstract keyword is used to create an abstract class and method. 
     4. Abstract classes cannot be instantiated. 
     5. When an abstract class is subclassed, the subclass usually provides implementations 
    for all of the abstract methods in its parent class. 
*/