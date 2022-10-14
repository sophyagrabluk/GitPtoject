public class HW_6_ClassMethods {
    public static void main(String[] args) {

        // Напишите программу,которая создает три объекта класса CreditCard,
        // у которых заданы номер счета и начальная сумма
        CreditCard_HW creditcardAlfa = new CreditCard_HW(123456789, 2600);
        CreditCard_HW creditcardBelInvest = new CreditCard_HW(1133557799, 1200);
        CreditCard_HW creditcardSber = new CreditCard_HW(22446688, 650);

        creditcardAlfa.showAllInfo();
        creditcardBelInvest.showAllInfo();
        creditcardSber.showAllInfo();

        System.out.println();

        // Положите деньги на первые две карточки и снимите с третьей
        creditcardAlfa.current_balance = creditcardAlfa.addMoney(creditcardAlfa.current_balance, 500);
        creditcardBelInvest.current_balance = creditcardBelInvest.addMoney(creditcardBelInvest.current_balance, 50);
        creditcardSber.current_balance = creditcardSber.takeMoney(creditcardSber.current_balance, 240);

        // Выведите на экран текущее состояние всех трех карточек
        System.out.println("Состояние карточек после изменений баланса");
        creditcardAlfa.showAllInfo();
        creditcardBelInvest.showAllInfo();
        creditcardSber.showAllInfo();
    }
}