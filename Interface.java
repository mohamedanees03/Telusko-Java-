public class Interface
{
    public static void main(String[] args)
    {
        Anees obj;    
        obj=new Abi();
        obj.show();
        obj.config();     
        System.out.println(Anees.place);
    }    
}

interface Anees
{
    int num=9;         // All the variables in the inteface are final and static 
    String place="Neyveli";

    void show();
    void config();
}

class Abi implements Anees
{
    public void show()
    {
        System.out.println("In show");    
    }
    public void config() 
    {
        System.out.println("In config");    
    }
    
}