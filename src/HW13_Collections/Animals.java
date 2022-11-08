package HW13_Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class Animals {
    Scanner scanner = new Scanner(System.in);
    LinkedList<String> animals = new LinkedList<>();

    void addAnimal() {
        System.out.println("Введите животоное, которого Вы хотите добавить: ");
        animals.addLast(scanner.nextLine());
    }

    void removeAnimal() {
        animals.removeFirst();
    }

    void getInfoAboutAllAnimals() {
        System.out.println(animals);
    }
}
