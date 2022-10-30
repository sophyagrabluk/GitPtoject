package HW10_String;

import java.util.Scanner;

public class AverageLenght {
    public static void main(String[] args) {
        // 3. Ввести 3 строки с консоли. Вывести на консоль те строки,
        // длина которых меньше средней, а также их длину.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 строки:");
        String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.nextLine();
        }
        System.out.println();

        int avLen = 0;
        for (int i = 0; i < str.length; i++) {
            avLen = avLen + str[i].length();
        }
        avLen = avLen / 3;
        System.out.println("Средняя длина строк: " + avLen);

        for (int i = 0; i < str.length; i++) {
            if (str[i].length() < avLen) {
                System.out.println(str[i] + ", её длина: " + str[i].length());
            }
        }


    }
}
