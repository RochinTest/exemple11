
import java.util.Scanner;

public class Main {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m = 0, n = 0,p=0;
        m1:
        {
            for (int i = 0; i < 10; i++) {
                System.out.println("Введите два не одинаковых числа");
                if (sc.hasNextInt())
                    m = sc.nextInt();
                n = sc.nextInt();
                if (m == n) System.out.println("Числа равны");
                else break m1;
            }
        }
        if (m > n) {
            p = (n + m) / 2;
            m = (n * m) * 2;

        } else p = (n * m) * 2;
        m = (n + m) / 2;

        System.out.println(m + " " + p);


    }
}






