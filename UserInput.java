import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter the number = ");
        // int num=System.in.read();
        // System.out.println(num);

        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(in);

        int num=Integer.parseInt(bf.readLine());
        System.out.println(num);

        bf.close();
    }
}
