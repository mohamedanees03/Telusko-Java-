/*
    Types Of Exception
    1.Arithemtic 
    2.ArrayIndex
    3.Null Pointer
*/


public class MultiCatchExceptionHandler {
    public static void main(String[] args) {
        int[] nums=new int[5];
        int num=19;
        try{
            int ans=num/0;
            System.out.println(ans);
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of Array");
        }
        catch(Exception e){
            System.out.println("Something Went Wrong "+e);
        }
    }
}

