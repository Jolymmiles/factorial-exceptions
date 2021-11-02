public class MathUtils {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отриацтельного числа не сущеастует");
        } else if (n > 15) {
            throw new IllegalArgumentException("Факториал не поместился");
        }
        int fac = 1;
        for (int i = n; i > 0; i--)
            fac *= i;
        return fac;
    }
}
