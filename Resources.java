/*public class Resources{
    public static void main(String[] args) {
        int i=0;
        int j=0;
        try{
            j=18/i;
            System.out.println("Bye");
        }
        catch(Exception e){
            System.out.println("Something went wrong....");
        }
        finally{
            System.out.println("Bye");
        }
    }

    Finally = It is the block used to close the resources
}*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Resources {
    public static void main(String[] args) throws IOException {
        int num=0;
        BufferedReader br=null;
        try{
            InputStreamReader in=new InputStreamReader(System.in);
            br=new BufferedReader(in);
            num=Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        finally{
            br.close();
        }
    }
}