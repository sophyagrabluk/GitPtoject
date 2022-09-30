import java.util.Scanner;

public class HW_2 {
    public static void main(String[] args) {
        /* 1. Написать программу для вывода названия поры года по номеру
        месяца. При решении используйте оператор switch-case. */

        switch ("5") {
            case "1", "2", "12":
                System.out.println("Зима");
                break;
            case "3", "4", "5":
                System.out.println("Весна");
                break;
            case "6", "7", "8":
                System.out.println("Лето");
                break;
            case "9", "10", "11":
                System.out.println("Осень");
                break;
            default:
                System.out.println("Нет совпадений"); }

        /* 2. Написать программу для вывода названия поры года по номеру
        месяца. При решении используйте оператор if-else-if. */
        int month = 9;

        if (month == 1){
            System.out.println("Зима");}
        else if (month == 2){
            System.out.println("Зима");}
        else if (month == 3){
            System.out.println("Весна");}
        else if (month == 4){
            System.out.println("Весна");}
        else if (month == 5){
            System.out.println("Весна");}
        else if (month == 6){
            System.out.println("Лето");}
        else if (month == 7){
            System.out.println("Лето");}
        else if (month == 8){
            System.out.println("Лето");}
        else if (month == 9){
            System.out.println("Осень");}
        else if (month == 10){
            System.out.println("Осень");}
        else if (month == 11){
            System.out.println("Осень");}
        else if (month == 12){
            System.out.println("Зима");}
        else {
            System.out.println("Нет совпадений"); }

        /* 3. Напишите программу, которая будет принимать на вход число
        и на выход будет выводить сообщение четное число или нет.
        Для определения четности числа используйте операцию получения остатка от деления
        (операция выглядит так: '% 2'). */
        int someValue = 238;
        if (someValue % 2 == 0) {
            System.out.println("Число четное"); }
        else {
            System.out.println("Число нечетное"); }

        /* 4. Для введенного числа t (температура на улице) вывести:
        Если t>–5, то вывести «Тепло». Если –5>= t > –20, то вывести «Нормально».
        Если –20>= t, то вывести «Холодно». */
        int t = -11;
        if (t > -5) {
            System.out.println("Тепло"); }
        if (t > -20 && t <= -5) {
            System.out.println("Нормально"); }
        if (t <= -20) {
            System.out.println("Холодно"); }

        //1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
        for (int a = 1; a <= 99; a++)
            if (a % 2 != 0) {
                System.out.print(a + " "); }

        // 2. Необходимо вывести на экран числа от 5 до 1.
        System.out.println(); //чтобы разделить 1 и 2 задания в консоли
        for (int b = 5; b >= 1; b--)
            System.out.print(b + " ");
        // или
        System.out.println(); //чтобы разделить
        int min = 5;
        do {
            System.out.print(min-- + " "); }
        while (min >=1);

        /* 4. Необходимо, чтоб программа выводила на экран вот такую последовательность:
         7 14 21 28 35 42 49 56 63 70 77 84 91 98/ В решении используйте цикл while. */
        System.out.println(); // чтобы разделить 3 и 4 задания в консоли
        int numbers = 7;
        while (numbers <=  98) {
            System.out.print(numbers + " ");
            numbers = numbers + 7; }

        // 5. Вывести 10 первых чисел последовательности 0, -5,-10,-15.
        System.out.println(); // чтобы разделить 4 и 5 задания в консоли
        int minnum = 0;
        while (minnum >= -45) {
            System.out.print(minnum + "," + " ");
            minnum = minnum - 5; }

        // 6. Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
        System.out.println(); // чтобы разделить 5 и 6 задания в консоли
        for (int sq = 10; sq <= 20; sq++)
            System.out.print(sq * sq + " ");

          /* 3. Напишите программу, где пользователь вводит любое целое положительное число.
        А программа суммирует все числа от 1 до введенного пользователем числа.
        Для ввода числа воспользуйтесь классом Scanner.*/
        System.out.println(); //чтобы разделить 2 и 3 задания в консоли
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int someVal = scanner.nextInt();
        int z = 0;
        for (int i=1; i<= someVal; i++){
            z = z + i; }
            System.out.println (z);
    }
}
