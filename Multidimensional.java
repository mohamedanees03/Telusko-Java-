import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                // System.out.println(arr[i][j]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
