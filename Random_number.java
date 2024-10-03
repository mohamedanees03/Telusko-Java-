import java.util.*;

public class Random_number
{
    public static void main(String[] args)
    {
        int i=10;
        while(i>0){
            System.out.println(generateOTP());
            i--;
        }
    }
    public static int generateOTP()
    {   
        Random random=new Random();
        int otp=100000+random.nextInt(900000);
        return otp;
    }    
}
