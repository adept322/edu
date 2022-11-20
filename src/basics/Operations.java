package basics;

/**
 * Documentation
 * Operations (logics + numbers)
 *
 * https://javarush.ru/groups/posts/logicheskie-operacii-v-java
 * @author Vitaliy
 * @version 1.0
 */
public class Operations {
    public static void main(String[] args) {
        int a = 9;
        int b = 5;

        // Sum
        int c = a + b;
        // Subtraction
        int d = a - b;
        // Multiplication
        int e = a * b;
        // Division
        int f = a / b;

        // Mod
        int g = a % b;

        // Postfix
        /*
         Decrement
         z = a -> a--
         */
        int z = a--;
        /*
         Increment
         x = a -> a++
         */
        int x = a++;

        // Prefix
        /*
         Decrement
         a = a++ -> v = a
         */
        int v = --a;
        /*
         Increment
         a = a++ -> n = a
         */
        int n = ++a;
    }
}
