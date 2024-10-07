import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class MyStreamExample {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>(); 
        nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(1);

        // Stream<Integer> s1=nums.stream();
        // Stream<Integer> s2=s1.filter(n -> n%2==0);
        // Stream<Integer> s3=s2.map(n-> n*2);
        // int result=s3.reduce(0, (c,e)->c+e);

        int result = nums.stream()
                        .filter(n-> n%2==0)
                        .map(n->n*2)
                        .reduce(0, (a,b) -> a+b);

        // s1.forEach(n -> System.out.println(n));
        // s2.forEach(n -> System.out.println(n));
        // s3.forEach(n-> System.out.println(n));
        System.out.println(result);

        Stream<Integer> sortedValues=nums.stream().sorted();

        sortedValues.forEach(n-> System.out.println(n));


    }
}