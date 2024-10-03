/*
Encapsulation in Java is a fundamental concept in object-oriented programming (OOP) that refers to the bundling of data and methods that operate on that data within a single unit, which is called a class in Java. 
Java Encapsulation is a way of hiding the implementation details of a class from outside access and only exposing a public interface that can be used to interact with the class.
In Java, encapsulation is achieved by declaring the instance variables of a class as private, which means they can only be accessed within the class. 
To allow outside access to the instance variables, public methods called getters and setters are defined, which are used to retrieve and modify the values of the instance variables, respectively. 
By using getters and setters, the class can enforce its own data validation rules and ensure that its internal state remains consistent.
*/

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(5);
        obj.setName("shamith");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}

class Human {
    private int age = 11;
    private java.lang.String name = "anees";

    void setAge(int a) {
        age = a;
    }

    int getAge() {
        return age;
    }

    public void setName(java.lang.String string) {
        name = string;
    }

    java.lang.String getName() {
        return name;
    }
}

// Encapusalting the data and methods is called "encapsulation".