package HW9_Hens;
import java.util.Random;

public class Main_Hens {
    public static void main(String[] args) {
        // В Main создать 100 кур разных парод(случайное количество), вывести описание каждой пароды.
        Random random = new Random();

        for (int i = 0; i < random.nextInt(10); i++) {
            RussianHen russianHen = new RussianHen();
            System.out.println(russianHen.getDescription());
        }
        for (int i = 0; i < random.nextInt(10); i++) {
            UkrainianHen ukrainianHen = new UkrainianHen();
            System.out.println(ukrainianHen.getDescription());
        }
        for (int i = 0; i < random.nextInt(10); i++) {
            MoldovanHen moldovanHen = new MoldovanHen();
            System.out.println(moldovanHen.getDescription());
        }
        for (int i = 0; i < random.nextInt(10); i++) {
            BelarusianHen belarusianHen = new BelarusianHen();
            System.out.println(belarusianHen.getDescription());
        }
// Посчитать общее количество снесённых яиц за год.
        int allEggsFromRussian = RussianHen.countHen * RussianHen.eggsPerYear;
        int allEggsFromUkrainian = UkrainianHen.countHen * UkrainianHen.eggsPerYear;
        int allEggsFromMoldovan = MoldovanHen.countHen * MoldovanHen.eggsPerYear;
        int allEggsFromBelarusian = BelarusianHen.countHen * BelarusianHen.eggsPerYear;

        int allEggs = allEggsFromRussian + allEggsFromUkrainian + allEggsFromMoldovan + allEggsFromBelarusian;

        System.out.println("Всего яиц от русской курицы " + allEggsFromRussian);
        System.out.println("Всего яиц от украинсой курицы " + allEggsFromUkrainian);
        System.out.println("Всего яиц от молдовской курицы " + allEggsFromMoldovan);
        System.out.println("Всего яиц от белорусской курицы " + allEggsFromBelarusian);
        System.out.println("Всего яиц за год: " + allEggs);
    }
}
