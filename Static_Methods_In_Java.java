public class Static_Methods_In_Java {
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

        Mobile.show1(obj1);
    }
}

class Mobile {
    String brand;
    int price;
    static String name; // Instance variable

    public void show() {
        System.out.println(brand + "     : " + price + " = " + name);
    }

    public static void show1(Mobile obj){
        System.out.println(obj.brand + "     : " + obj.price + " = " + name);
        System.out.println("This is a static method");
    }
}