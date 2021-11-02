import java.util.Scanner;

public class Factorials {

    public static void main(String[] args) {
        String keepGoing = "Y";
        Scanner scan = new Scanner(System.in);

        while (keepGoing.equals("Y")) {
            System.out.print("Введите число: ");
            int val = scan.nextInt();
            if (val <0 | val > 15) {
                try {
                    throw new IllegalArgumentException();
                } catch (IllegalArgumentException e) {
                    if (val < 0) {
                        System.out.println("Факториала для отрацтельного числа нету");
                    } else if (val > 15) {
                        System.out.println("Факториала е помещается в int");
                    }

                    break;
                }
            }
                System.out.println(
                        String.format(
                                "Факториал(\"%d\") = %d",
                                val, MathUtils.factorial(val)
                        )
                );
                System.out.print("Вычислить другой факториал? (y/n) ");
                keepGoing = scan.next().toUpperCase();

        }
    }
}
