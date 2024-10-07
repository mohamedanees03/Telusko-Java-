// public class Lambda {
//     public static void main(String[] args) {
//         A obj= i -> System.out.println("In show "+i);
//         obj.show(5);
//     }
// }
// // -> = Lambda expression

// @FunctionalInterface
// interface A{
//     void show(int i);
// }



// Lambda expression using return type

public class Lambda {
    public static void main(String[] args) {
        A obj=(i,j) -> i+j;
        int res=obj.add(5, 5);
        System.out.println(res);
    }
}

@FunctionalInterface
interface A{
    int add(int i,int j);
}