public class HW_6_ClassMethods {
    public static void main(String[] args) {

     // Напишите программу,которая создает три объекта класса CreditCard,
     // у которых заданы номер счета и начальная сумма
        CreditCard_HW creditcardAlfa = new CreditCard_HW(123456789, 2600); // создали 1-ый объект
        CreditCard_HW creditcardBelInvest = new CreditCard_HW(1133557799, 1200); // создали 2-ой объект
        CreditCard_HW creditcardSber = new CreditCard_HW(22446688, 650); // создали 3-ий объект

        // Положите деньги на первые две карточки и снимите с третьей
        int resultAlpha = (creditcardAlfa.addMoney(creditcardAlfa.current_balance, 500)); // положили деньги на 1-ую карту
        int resultBelInvest = (creditcardBelInvest.addMoney(creditcardBelInvest.current_balance, 50)); // положили деньги на 2-ую карту
        int resultSber = (creditcardSber.takeMoney(creditcardSber.current_balance, 240)); // сняли деньги с 3-ей карты

        // Выведите на экран текущее состояние всех трех карточек
        System.out.println("Номер карты: " + creditcardAlfa.account_number + ", Текущий счёт: " + resultAlpha);
        System.out.println("Номер карты: " + creditcardBelInvest + ", Текущий счёт: " + resultBelInvest);
        System.out.println("Номер карты: " + creditcardSber + ", Текущий счёт: " + resultSber);

      //  creditcardAlfa.showAllInfo();
      //  creditcardBelInvest.showAllInfo();
      //  creditcardSber.showAllInfo();

    }
}