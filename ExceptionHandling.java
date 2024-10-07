/*
    Types Of Errors 
    1.Complie time error
    2.Run time error
    3.Logical error
*/

public class ExceptionHandling {
    public static void main(String[] args) {
        int a=2;
        try{
            int b=18/a;
            System.out.println(b);
        }
        catch (Exception e){
            System.out.println("Bye");   
        }
    }
}
