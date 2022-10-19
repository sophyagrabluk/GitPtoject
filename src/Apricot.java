public class Apricot extends Fruit{
    static int count;
    final int COSTAPRICOT = 8;

    public Apricot() {
        count++;
    }

    @Override
    void price(double weight) {
        double price = weight * COSTAPRICOT;
        System.out.println(price);
    }

    @Override
    void commonCount(int count) {
        System.out.println(count++);
    }
}

