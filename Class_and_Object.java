class Calculator{
    int add(int n1,int n2){
        return n1+n2;
    }
}

public class Class_and_Object {
    public static void main(String[] args) {
        int num1=4;
        int num2=5;
        Calculator calc=new Calculator(); // Object -> It is the instance of the class 
        int result=calc.add(num1, num2);
        System.out.println(result);
    }
}


// Notes - In JDK we have JRE and JVM 