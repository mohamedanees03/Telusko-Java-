public class Enum_class {
    public static void main(String[] args) {
        // Status s = Status.Running;
        // System.out.println(s.getClass().getSuperclass());

        // Laptop lap=Laptop.TUF;
        // System.out.println(lap+":"+lap.getPrice());
        
        for(Laptop lap:Laptop.values()){
            System.out.println(lap+":"+lap.getPrice());
        }
    }
}

enum Status{
    Running,Failed,Success,Pending;
}

enum Laptop{
    TUF(50000),HP(40000),Lenovo(80000),Victus(90000);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}