package HW17_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAddress {
    public static void main(String[] args) {
        // Написать программу для проверки на валидность введенного ip адреса. Пусть ip адрес задается с консоли.
        // Программа должна проверять валидность введенного ip адреса с помощью регулярного выражения
        // и выводить результат проверки на экран.
        Scanner scanner = new Scanner(System.in);
        String ipAddress = scanner.nextLine();
        Pattern patternIP = Pattern.compile("^[0-9]{1,4}[.][0-9]{1,4}[.][0-9]{1,4}[.][0-9]{1,4}$");
        Matcher matcherIP = patternIP.matcher(ipAddress);
        if (matcherIP.find()) {
            System.out.println("Your IP address is " + matcherIP.group());
        } else
            System.out.println("IP address is wrong");
    }
}

