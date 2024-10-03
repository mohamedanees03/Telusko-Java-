public class Stack_and_Heap_In_Java {
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        Calculator obj1=new Calculator();
        obj.num=8;
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}

class Calculator{
    int num=5;
    public int add(int a,int b){
        System.out.println(num);
        return a+b;
    }
}
