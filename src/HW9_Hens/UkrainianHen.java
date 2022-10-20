package HW9_Hens;

public class UkrainianHen extends Hen{
    private final String COUNTRY = "Украина";
    public static int countHen;
    private static int eggsPerMonth = 7;
    public static int eggsPerYear= eggsPerMonth * 12;

    public UkrainianHen() {
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
