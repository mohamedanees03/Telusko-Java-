public class MethodOverloading_In_Java{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result1 = calc.sum(5, 5);
        double result2 = calc.sum(5.46, 2.36);
        String result3 = calc.sum("Anees", "Abi");

        System.out.println(result1);    // Output: 10
        System.out.println(result2);    // Output: 7.82
        System.out.println(result3);    // Output: AneesAbi
    }
}

class Calculator {
    // Method to sum two integers
    public int sum(int a, int b) {
        return a + b;
    }

    // Method to sum two double values
    public double sum(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    public String sum(String a, String b) {
        return a + b;
    }
}
