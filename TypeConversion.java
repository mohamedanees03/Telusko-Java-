public class TypeConversion {
    public static void main(String[] args) {
        float f = 9.8f;
        int t = (int) f;
        System.out.println(t);

        int n = 258; // If n > 127 it will do modulus operator with %256 and will return the remainder
        byte b = (byte) n;
        System.out.println(b);

    }
}
