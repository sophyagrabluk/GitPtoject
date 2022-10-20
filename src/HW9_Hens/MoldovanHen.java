package HW9_Hens;

public class MoldovanHen extends Hen{
    private final String COUNTRY = "Молдова";
    public static int countHen;
    private static int eggsPerMonth = 10;
    public static int eggsPerYear= eggsPerMonth * 12;

    public MoldovanHen() {
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
