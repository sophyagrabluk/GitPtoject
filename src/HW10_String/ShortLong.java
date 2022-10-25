package HW10_String;

import java.util.Scanner;

public class ShortLong {
    public static void main(String[] args) {
        // Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
        // Вывести найденные строки и их длину.
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.nextLine();
        }
        System.out.println();

        // самая длинная строка
        int lg = 0;
        String longestStr = null;
        for (int x = 0; x < str.length; x++) {
            if (str[x].length() > lg) {
                lg = str[x].length();// lg - длина самой длинной строки
                longestStr = str[x];
            }
        }
        System.out.println("Самая длинная строка: " + longestStr + " , её длина: " + lg);

        // самая короткая строка
        int sh = lg;
        String shortestStr = null;
        for (int x = 0; x < str.length; x++) {
            if (str[x].length() < sh) {
                sh = str[x].length();// lg - длина самой длинной строки
                shortestStr = str[x];
            }
        }
        System.out.println("Самая короткая строка: " + shortestStr + " , её длина: " + sh);
    }
}
