/*
    DataType	Size	    Description
    byte	    1 byte	    Stores whole numbers from -128 to 127
    short	    2 bytes	    Stores whole numbers from -32,768 to 32,767 (-2^15 to 2^15-1)
    int	        4 bytes	    Stores whole numbers from -2,147,483,648 to 2,147,483,647 (-2^31 to 2^31-1)
    long	    8 bytes	    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (-2^63 to 2^63-1)
    float	    4 bytes	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    double	    8 bytes	    Stores fractional numbers. Sufficient for storing 15 decimal digits
    boolean	    1 bit	    Stores true or false values
    char	    2 bytes	    Stores a single character/letter or ASCII values
*/

class DataTypes {
    public static void main(String[] args) {
        byte by = 127;
        short shrt = 852;
        int num = 78;
        long lng = 89646l;
        float flt = 5.24f;
        double d = 5.265;
        char c = 'm';
        System.out.println(num);
        System.out.println(by);
        System.out.println(shrt);
        System.out.println(lng);
        System.out.println(flt);
        System.out.println(d);
        System.out.println(c);
    }
}