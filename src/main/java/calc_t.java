/**
 * Created by me 14.06.18
 *
 * @author me
 */

import java.util.Scanner;

public class calc_t {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое дробное число:");
        float i = scanner.nextFloat();
        System.out.println("Введите второе дробное число:");
        float j = scanner.nextFloat();
        float s = i + j;
        System.out.printf("Сумма чисел: %.4f", s);
        scanner.close();
    }
}
