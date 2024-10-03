/* Polymorphism is considered one of the important features of Object-Oriented Programming.
Polymorphism allows us to perform a single action in different ways. 
In other words, polymorphism allows you to define one interface and have multiple implementations. 
The word poly means many and morphs means forms, So it means many forms.*/

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println(A.add(5.3,6.9,7.3));
        System.out.println(B.add(2,8));
    }
}

class A{
    static double add(double a,double b,double c){
        return a+b+c;
    }
}

class B{
    static int add(int a,int b){
        return a+b;
    }
}
