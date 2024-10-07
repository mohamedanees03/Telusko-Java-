/*
    Threads allows a program to operate more efficiently 
    by doing multiple things at the same time.
    Threads can be used to perform complicated tasks in the background 
    without interrupting the main program.
*/

public class Threads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hi");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
        }
    }
}