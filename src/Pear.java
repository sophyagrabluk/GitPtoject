public class Pear extends Fruit{
    static int count;
    final int COSTPEAR = 6;

    public Pear() {
        count++;
    }

    @Override
    void price(double weight) {
        double price = weight * COSTPEAR;
        System.out.println(price);
    }

    @Override
    void commonCount(int count) {
        System.out.println(count++);
    }
}
