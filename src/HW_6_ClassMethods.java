public class HW_6_ClassMethods {
    public static void main(String[] args) {

     // Напишите программу,которая создает три объекта класса CreditCard,
     // у которых заданы номер счета и начальная сумма
        CreditCard_HW creditcardAlfa = new CreditCard_HW(123456789, 2600); // создали 1-ый объект
        CreditCard_HW creditcardBelInvest = new CreditCard_HW(1133557799, 1200); // создали 2-ой объект
        CreditCard_HW creditcardSber = new CreditCard_HW(22446688, 650); // создали 3-ий объект

        // Положите деньги на первые две карточки и снимите с третьей
        System.out.println(creditcardAlfa.addMoney(creditcardBelInvest.current_balance, 500)); // положили деньги на 1-ую карту
        System.out.println(creditcardBelInvest.addMoney(creditcardBelInvest.current_balance, 50)); // положили деньги на 2-ую карту
        System.out.println(creditcardSber.takeMoney(creditcardSber.current_balance, 240)); // сняли деньги с 3-ей карты

        // Выведите на экран текущее состояние всех трех карточек
        creditcardAlfa.showAllInfo();
        creditcardBelInvest.showAllInfo();
        creditcardSber.showAllInfo();

    }
}