
public class Main {
    public static void main(String[] args) {
// Создать 6 объектов разных фруктов c разным весом(на выбор).
        Apple appleRed = new Apple();
        appleRed.price(2.00);

        Apple appleGreen = new Apple();
        appleGreen.price(3.50);

        Pear pearBel = new Pear();
        pearBel.price(3.00);

        Pear pearUkr = new Pear();
        pearUkr.price(4.00);

        Apricot apricotTur = new Apricot();
        apricotTur.price(1.00);

        Apricot apricotEgy = new Apricot();
        apricotEgy.price(0.50);
// Подсчитать общее количество и стоимость созданных фруктов.
        System.out.println(Apple.count + Pear.count + Apricot.count);



// А также общие количество стоимость отдельно яблок, груш и абрикос.


    }
}
