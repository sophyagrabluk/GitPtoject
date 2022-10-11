public class HW_6_ClassMethods {
    public static void main(String[] args) {
     /*   ПРИМЕР
     CreditCard_HW creditCard1 = new CreditCard_HW(123456789, 1200);

        System.out.println(creditCard1.addMoney(1200, 500));
        System.out.println(creditCard1.takeMoney(1200, 100));
        creditCard1.showAllInfo();
     */

        CreditCard_HW creditcardAlfa = new CreditCard_HW(123456789, 2600); // создали 1-ый объект
        CreditCard_HW creditcardBelInvest = new CreditCard_HW(1133557799, 1200); // создали 2-ой объект
        CreditCard_HW creditcardSber = new CreditCard_HW(22446688, 650); // создали 3-ий объект

        System.out.println(creditcardAlfa.addMoney(creditcardBelInvest.current_balance, 500));
        System.out.println(creditcardBelInvest.addMoney(creditcardBelInvest.current_balance, 50));
        System.out.println(creditcardSber.takeMoney(creditcardSber.current_balance, 240));

        creditcardAlfa.showAllInfo();
        creditcardBelInvest.showAllInfo();
        creditcardSber.showAllInfo();
    }
}