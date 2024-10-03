public class ForLoop {
    public static void main(String[] args) {
        int num=5;
        for(int i=1;i<=num;i++){
            System.out.println("DAY 0"+i);
            for(int j=1;j<=9;j++){
                System.out.println((j+8)+"-"+(j+9));
            }
        }
    }
}
