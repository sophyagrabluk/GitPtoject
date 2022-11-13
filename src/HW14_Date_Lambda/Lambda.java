package HW14_Date_Lambda;
import java.util.Random;
import java.util.function.*;

public class Lambda {
    public static void main(String[] args) {
        //1. Написать программу, которая проверяет, что строка начинается буквой “J”или “N” и заканчивается “A”.
        Predicate<String> startJ = x -> x.startsWith("J");
        Predicate<String> startN = x -> x.startsWith("N");
        Predicate<String> endA = x -> x.endsWith("A");
        Predicate<String> result = startJ.or(startN).and(endA);
        System.out.println(result.test("Jesus A"));

        //2. Написать лямбда выражение, которое принимает на вход объект типа Box и
        //выводит на консоль сообщение “Отгрузили ящик с весом n” где n – поле в классе которое содержит вес ящика.
        Consumer<Box> box = x -> System.out.println("Отгрузили ящик с весом " + x.getWEIGHT() + " кг");
        box.accept(new Box());

        //3. Написать лямбда выражение, которое принимает на вход число и возвращает значение “Положительное число”,
        //“Отрицательное число” или  “Ноль”.
        Function<Integer, String> value = x -> {
            if (x > 0) {
                return "Положительное число";
            }
            if (x < 0) {
                return "Отрицательное число";
            }
            return "Ноль";
        };
        System.out.println(value.apply(-456));

        //4. Написать лямбда выражение, которое возвращает случайное число от 0 до 10.
        Random random = new Random();
        Supplier<Integer> lambda4 = () -> {
            return random.nextInt(10);
        };
        System.out.println(lambda4.get());
    }
}