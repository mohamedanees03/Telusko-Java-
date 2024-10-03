public class Wrapper
{
    public static void main(String[] args)
    {
        int num=5;
        Integer num1=num;  // Auto-Boxing
        System.out.println(num1);

        // int num2=num1.intValue();     // Auto-Unboxing
        int num2=num1;
        System.out.println(num2);

        String str="3";   // Convert string to int
        int num3=Integer.parseInt(str); 
        System.out.println(num3*3);
    }    
}


/*
    Storing Primitive values in the object is called Auto-Boxing
*/