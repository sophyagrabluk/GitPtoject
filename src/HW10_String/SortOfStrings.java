package HW10_String;

import java.util.Scanner;

public class SortOfStrings {
    public static void main(String[] args) {
        // Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания значений их длины.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 строки:");
        String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.nextLine();
        }
        System.out.println();


        for (int i = str.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (str[j].length() > str[j + 1].length()) {
                    String tmp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

    }
}
