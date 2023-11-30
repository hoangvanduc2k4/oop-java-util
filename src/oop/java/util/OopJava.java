package oop.java.util;

/**
 *
 * @author DIEN MAY XANH
 */
public class OopJava {

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. N must be between 0 to 20.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long pro = 1;
        for (int i = 2; i <= n; i++) {
            pro *= i;
        }
        return pro;
    }
}
