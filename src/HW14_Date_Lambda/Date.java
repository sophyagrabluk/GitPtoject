package HW14_Date_Lambda;
import java.time.LocalDate;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        //1. Написать программу для вывода на консоль названия дня недели по введенной дате.
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int date = scanner.nextInt();
        LocalDate currentDate = LocalDate.of(year, month, date);
        System.out.println(currentDate.getDayOfWeek());

        //2. Написать программу для вывода на экран дату следующего вторника.
        switch (LocalDate.now().getDayOfWeek()) {
            case TUESDAY -> System.out.println(LocalDate.now().plusDays(7));
            case WEDNESDAY -> System.out.println(LocalDate.now().plusDays(6));
            case THURSDAY -> System.out.println(LocalDate.now().plusDays(5));
            case FRIDAY -> System.out.println(LocalDate.now().plusDays(4));
            case SATURDAY -> System.out.println(LocalDate.now().plusDays(3));
            case SUNDAY -> System.out.println(LocalDate.now().plusDays(2));
            case MONDAY -> System.out.println(LocalDate.now().plusDays(1));
        }
    }
}
