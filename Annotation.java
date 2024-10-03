public class Annotation
{
    public static void main(final String[] args)
    {
        final B obj=new B();
        obj.showThatDataWhichBelongsToThisClass();
    }    
}

@Deprecated
class A 
{
    public void showThatDataWhichBelongsToThisClass()
    {
        System.out.println("In A show");
    }
}

class B extends A 
{

    @Override
    public void showThatDataWhichBelongsToThisClass() {
        // TODO Auto-generated method stub
        super.showThatDataWhichBelongsToThisClass();
    }
    
}



