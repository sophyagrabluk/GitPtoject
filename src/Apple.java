public class Apple extends Fruit {
    static int count;
    final int COST_APPLE = 5;

    public Apple() {
        count++;
    }

    @Override
    void price(double weight) {
        double price = weight * COST_APPLE;
        System.out.println(price);
    }

    @Override
    void commonCount(int count) {
        System.out.println(count++);

    }
}
