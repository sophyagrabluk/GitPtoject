package HW9_Hens;

public class RussianHen extends Hen {
    private final String COUNTRY = "Россия";
    public static int countHen;
    private static int eggsPerMonth = 5;
    public static int eggsPerYear= eggsPerMonth * 12;

    public RussianHen() {
        this.countHen++;
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return eggsPerMonth;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ". Моя страна - " + this.COUNTRY + ". Я несу " + this.eggsPerMonth + " яиц в месяц.";
    }
}
