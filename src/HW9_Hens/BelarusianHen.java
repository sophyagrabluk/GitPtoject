package HW9_Hens;

public class BelarusianHen extends Hen{
    private final String COUNTRY = "Беларусь";
    public static int countHen;
    private static int eggsPerMonth = 15;
    public static int eggsPerYear= eggsPerMonth * 12;

    public BelarusianHen() {
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
