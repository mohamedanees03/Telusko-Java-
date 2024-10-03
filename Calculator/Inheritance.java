/*
Java, Inheritance is an important pillar of OOP(Object-Oriented Programming). 
It is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class. 
In Java, Inheritance means creating new classes based on existing ones.
A class that inherits from another class can reuse the methods and fields of that class. 
In addition, you can add new fields and methods to your current class as well.  
*/

package Calculator;

public class Inheritance {
    public static void main(String[] args) {
        Calc obj=new Calc();
        int r1=obj.add(5, 40);
        int r2=obj.sub(50, 5);
        int r3=obj.mul(5,5);
        int r4=obj.div(100,20);
        double r5=obj.power(4);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
    }
}


