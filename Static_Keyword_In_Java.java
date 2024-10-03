public class Static_Keyword_In_Java {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Realme";
        obj1.price = 27000;
        Mobile.name = "12 Pro Plus";

        Mobile obj2 = new Mobile();
        obj2.brand = "Redmi";
        obj2.price = 15000;
        Mobile.name = "12 5G";

        obj1.show();
        obj2.show();
    }
}

class Mobile {
    String brand;
    int price;
    static String name; // Instance variable

    void show() {
        System.out.println(brand + "     : " + price + " = " + name);
    }
}