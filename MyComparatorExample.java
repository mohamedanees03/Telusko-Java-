import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyComparatorExample {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10)
                    return 1;
                else
                    return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(53);
        nums.add(31);
        nums.add(86);
        nums.add(94);
        nums.add(45);

        //  Collections.sort(nums);
        Collections.sort(nums, com);   //  Pass the comparator to sort
        System.out.println(nums);     // Output will be sorted based on the last digit
    }
}
