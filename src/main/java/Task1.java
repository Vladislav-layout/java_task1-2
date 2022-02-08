import java.util.Scanner;

/**
 * @see Task1#main(String[])
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double num1 = null;
        Double num2 = null;
        System.out.print("Введите 1 число: ");
        num1 = in.nextDouble();//записываем 1 введенное число
        System.out.print("Введите 2 число: ");
        num2 = in.nextDouble();//записываем 2 введенное число
        Double sum = num1 + num2;//суммируем полученные числа
        System.out.printf("Сумма: %.4f", sum); // вывод суммы и округление до 4 знаков после запятой
    }
}
