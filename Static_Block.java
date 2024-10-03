public class Static_Block
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        // Mobile obj1=new Mobile();
        // obj1.brand="realme";
        // obj1.price=270000;
        // Mobile.name="12";
        // obj1.show();

        Class.forName("Mobile"); // Class loader 
    }
}

class Mobile
{
    String brand;
    int price;
    static String name;

    static
    {
        name="Phone";
        System.out.println("In static block");
    }

    void show()
    {
        System.out.println(brand + ": " + price + " = " + name);
    }
}
