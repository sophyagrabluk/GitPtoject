package HW10_String;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DifferentStrings {
    public static void main(String[] args) {
        // Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
        // Если таких слов несколько, найти первое из них.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 строки:");
        String [] str = {scanner.nextLine(), scanner.nextLine(),scanner.nextLine()};
        Arrays.toString(str);

        System.out.println();


        }
    }
