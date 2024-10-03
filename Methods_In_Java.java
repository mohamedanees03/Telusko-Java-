import java.util.Scanner;

public class Methods_In_Java {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Computer obj=new Computer();
        obj.playMusic();
        System.out.println(obj.getMePen(num));
        sc.close();
    }   
}

class Computer{
    public void playMusic(){
        System.out.println("Music is Playing.....");
    }
    public String getMePen(int cost){
        if(cost>=10)
            return "Pen";
        else 
            return "nothing";
    }
}

