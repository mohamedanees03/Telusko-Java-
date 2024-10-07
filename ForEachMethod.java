import java.util.List;
import java.util.ArrayList;

public class ForEachMethod {
    public static void main(String[] args) {
       // List<Integer> nums=Arrays.asList(4,5,6,2,5,7);

        List<Integer> nums = new ArrayList<>();  // Specifying generic type
        nums.add(5);
        nums.add(6);
        nums.add(4);
        nums.add(3);

        nums.forEach(n -> System.out.print(n));
    }
}
