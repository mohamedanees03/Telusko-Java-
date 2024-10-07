// List
// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.List;


// public class MyCollectionExample {
//     public static void main(String[] args) {
//         List<Integer> nums=new ArrayList<>();
//         nums.add(5);
//         nums.add(6);
//         nums.add(7);
//         nums.add(8);

//         // System.out.println(nums);
//         // System.out.println(nums.get(3));
//         // System.out.println(nums.indexOf(6));
//     }
// }


// Set 
// import java.util.Set;
// import java.util.TreeSet;
// import java.util.HashSet;

// public class MyCollectionExample {
//     public static void main(String[] args) {
//         // Set<Integer> nums=new HashSet<Integer>();
//         Set<Integer> nums=new TreeSet<Integer>();
//         nums.add(52);
//         nums.add(63);
//         nums.add(71);
//         nums.add(89);
//         nums.add(6);
//         nums.add(15);
//         System.out.println(nums);
//     }
// }

// import java.util.Collection;
// import java.util.Iterator;
// import java.util.TreeSet;

// public class MyCollectionExample {
//     public static void main(String[] args) {
//         Collection<Integer> nums=new TreeSet<>();
//         nums.add(56);
//         nums.add(23);
//         nums.add(14);
//         nums.add(37);
        
//         Iterator values=nums.iterator();

//         while(values.hasNext())
//             System.out.print(values.next()+" ");

//         System.out.println(nums);
//     }
// }

import java.util.HashMap;
import java.util.Map;

public class MyCollectionExample {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Anees", 55);
        students.put("Eliyas", 85);
        students.put("Saleem", 95);
        students.put("Shamith", 45);

        // Print the entire HashMap
        // System.out.println(students);

        // Print the Value for the Key
        // System.out.println(students.get("Eliyas"));

        // Print only the KeySet
        // System.out.println(students.keySet());

        for(String key:students.keySet()){
            System.out.println(key+":"+students.get(key));
        }
        
    }
}
