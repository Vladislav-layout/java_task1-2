import java.util.Scanner;

/**
 * @see Task2#main(String[])
 * @see Task2#runMaxLength()
 * @see Task2#runCalculator()
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberTask = 0;
        System.out.println("Введите номер задания: (1 - Калькулятор; 2 - поиск максимального слова в массиве)");
        numberTask = in.nextInt();
        if (numberTask == 1) {
            runCalculator();
        } else if (numberTask == 2) {
            runMaxLength();
        }
    }

    public static void runMaxLength() {
        Scanner in = new Scanner(System.in);
        int count = 0;
        String[] arr;//объявляем массив, заявленной ранее размерностью
        int maxLengthOfWord = 0;//переменная для записи длины самого длинного слова
        int index = 0;//переменная для записи индекса самого длинного слова в массиве
        System.out.print("Введите количество слов: ");
        arr = new String[in.nextInt()];//Определение массива
        for (int i = 1; i <= arr.length; i++) {//инициализируем массив
            System.out.print("Введите " + i + " слово: ");
            arr[i - 1] = in.next();
            if (arr[i - 1].length() > maxLengthOfWord) {//проверка на самое длинное слово
                maxLengthOfWord = arr[i - 1].length();
                index = i - 1;//запись инекса самого длинного слова
            }
        }
        System.out.print("Результат: " + arr[index]);//вывод результата поиска
    }

    public static void runCalculator() {
        Scanner in = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        int sign = 0;
        double results = 0;
        System.out.print("Введите 1 число: ");
        num1 = in.nextDouble();
        System.out.print("Введите 2 число: ");
        num2 = in.nextDouble();
        System.out.println("Введите цифру соответсвующую нужной операции: 1 - '+'; 2 '-'; 3 - '/'; 4 - '*':");
        if (in.hasNextInt()) {
            sign = in.nextInt();//записываем цифру знака операции
            switch (sign) { //используем swich case для идентификации введенного знака
                case 1:
                    results = num1 + num2;  //сложение
                    break;
                case 2:
                    results = num1 - num2;  //вычитание
                    break;
                case 3:
                    if (num2 == 0) {
                        throw new RuntimeException("На ноль делить нельзя!");
                    } else {
                        results = num1 / num2;
                    }  //деление
                break;
                case 4:
                    results = num1 * num2; //умножение
                    break;
                default:
                    throw new RuntimeException("Такой операции нет.");
            }
            System.out.printf("\nРезультат: %.4f", results); // вывод суммы и округление до 4 знаков после запятой
        } else {
            System.err.println("Вы допустили ошибку при вводе. Попробуйте еще раз. ");
        }
    }
}
