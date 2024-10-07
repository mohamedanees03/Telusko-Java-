public class CustomExceptionExample {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;  // Assume j is zero

        try {
            // Directly assuming j == 0
            j=18/i;
            if (j == 0)
                throw new AneesException("I don't want to print");
        } catch (AneesException e) {
            // This block will execute because j is 0 and the exception is thrown
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}

class AneesException extends Exception {
    public AneesException(String str) {
        super(str);
    }
}
