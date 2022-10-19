public abstract class Fruit {
    double weight;
    // абстрактный метод, возвращающий стоимость фрукта,
    // который должен быть переопределен в каждом классе наследнике. Метод должен учитывать вес фрукта.
    abstract void price (double weight);

    abstract void commonCount (int count);
}
