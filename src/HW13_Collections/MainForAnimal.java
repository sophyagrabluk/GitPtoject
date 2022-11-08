package HW13_Collections;
public class MainForAnimal {
    public static void main(String[] args) {
        Animals animal = new Animals();
        animal.addAnimal();
        animal.addAnimal();
        animal.addAnimal();
        animal.addAnimal();
        animal.getInfoAboutAllAnimals();

        animal.removeAnimal();
        animal.removeAnimal();
        animal.getInfoAboutAllAnimals();
    }
}
