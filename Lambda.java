@FunctionalInterface
interface A{
    public void show();
}
public class Lambda {
    public static void main(String[] args) {
        A obj=() -> System.out.println("In A Show");
        obj.show();
    }
}
