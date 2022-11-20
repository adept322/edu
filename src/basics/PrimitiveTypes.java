package basics;

/**
 * Documentation
 * Primitive data types in Java
 * lowerCamelCase style only
 *
 * @author Vitaliy Chernikov
 * @version 1.0
 */

public class PrimitiveTypes {
    public static void integerTypes() {
        // 1 byte <-> 8 bit
        System.out.println("<---Integer types--->");
        /*
            Type -> byte
            Range of values: from (-2^7) to (2^7 - 1)
            Size: 1 byte or 8 bit
         */
        byte byteNumber = (byte) (Math.pow(2, 7) - 1);
        System.out.println("Byte");
        System.out.println("(max value)--> " + byteNumber);
        System.out.println("(min value)--< " + (byte) (-Math.pow(2, 7)));

          /*
            Type -> short
            Range of values: from (-2^15) to (2^15 - 1)
            Size: 2 byte or 16 bit
         */
        short shortNumber = (short) (Math.pow(2, 15) - 1);
        System.out.println("Short");
        System.out.println("(max value)--> " + shortNumber);
        System.out.println("(min value)--< " + (short) (-Math.pow(2, 15)));

        /*
            Type -> int
            Range of values: from (-2^31) to (2^31 - 1)
            Size: 4 byte or 32 bit
         */
        int intNumber = (int) (Math.pow(2, 31) - 1);
        System.out.println("Int");
        System.out.println("(max value)--> " + intNumber);
        System.out.println("(min value)--< " + (int) (-Math.pow(2, 31)));

        /*
            Type -> long
            Range of values: from (-2^63) to (2^63 - 1)
            Size: 8 byte or 64 bit
         */
        long longNumber = (long) (Math.pow(2, 63) - 1);
        System.out.println("Long");
        System.out.println("(max value)--> " + longNumber);
        System.out.println("(min value)--< " + (long) (-Math.pow(2, 63)));
    }

    public static void floatTypes() {
        // 1 byte <-> 8 bit
        System.out.println("<---Float types--->");
        /*
            Type -> float
            Range of values: from (1.4e-045) to (3.4e+038)
            Size: 4 byte or 32 bit
         */
        float floatNumber = (float) Math.pow(10, 38) * 3.4f;
        System.out.println("Float");
        System.out.println("(max value)--> " + floatNumber);
        System.out.println("(min value)--< " + (float) Math.pow(10, -45) * 1.4f);

        /*
            Type -> double
            Range of values: from (4.9e-324) to (1.8e+308)
            Size: 4 byte or 32 bit
         */
        double doubleNumber = Math.pow(10, -324) * 4.9d;
        System.out.println("Double");
        System.out.println("(max value)--> " + doubleNumber);
        System.out.println("(min value)--< " + Math.pow(10, 308) * 1.8d);
    }

    public static void charType() {
        System.out.println("<---Character types--->");
        /*
            Type -> char
            Range of values: from (2^0 - 1) to (2^16)
            Size: 2 byte or 16 bit
         */
        char f_symbol = 123;
        char s_symbol = '6';
        System.out.println("Character");
        System.out.println("Char value --> 123:  " + f_symbol);
        System.out.println("Char value: --> '6':  " + s_symbol);
    }

    public static void boolType() {
        System.out.println("<---Boolean types--->");
         /*
            Type -> bool
            Range of values: from (true) to (false)
            Size: 4 byte or 32 bit
         */

        char f_symbol = 123;
        char s_symbol = '6';
        System.out.println("Character");
        System.out.println("Char value --> 123:  " + f_symbol);
        System.out.println("Char value: --> '6':  " + s_symbol);
    }

    public static void main(String[] args) {
        System.out.println("Primitive data types");
        integerTypes();
        floatTypes();
        charType();

        // Declaration constant variable
        final long localVariable = 60L;
        // Declaration variables example
        byte a, b = 2, c = 4, d;
        char x, y, z;

        a = 5;
        d = 5;
        x = y = z = 'a';

        // Using literals for
        long veryLongNumber = 9_000_000_000_000L;

        int binNumber = 0b01000101;
        int hexNumber = 0x34ABCDEF;
        int octaNumber = 0777;

        float decimalNumberF = 100_000.9f;
        double decimalNumberD = 100_000.9d;

        /*
            \ddd - octal symbol (ddd)
            \\uxxxx - hex symbol Unicode (xxxx) -- -\
            \' - '
            \" - "
            \\ - \
            \n - new line
            \t - tabulation
         */
        char katakanaTu = '\u30c4';

        String text = "Hello, World!";
        String textA = new String("Hello, World!");

        int number1 = 42;
        int number2 = 33 + number1 + 4;

        /*
            Automatic type conversion
            1) types are compatible
            2) Length target type more than required type
         */
        float decimalNumber = 1998L;

        int a1 = 100;
        byte b1 = (byte) a1;
    }
}
