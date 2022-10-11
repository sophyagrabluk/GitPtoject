public class CreditCard_HW {
    long account_number;
    int current_balance;

    public CreditCard_HW(long accnum, int currbal) {
        this.account_number = accnum;
        this.current_balance = currbal;
    }

// Добавьте метод, который позволяет начислять сумму на кредитную карточку.
    int addMoney(int current_balance, int x) {
        return current_balance + x;
    }
// Добавьте метод, который позволяет снимать с карточки некоторую сумму.
    int takeMoney(int current_balance, int x) {
        return current_balance - x;
    }
// Добавьте метод, который выводит текущую информацию о карточке.
    void showAllInfo() {
        System.out.println("Номер карты: " + account_number + ", Текущий счёт: " + current_balance);
    }


}
