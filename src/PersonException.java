public class PersonException extends Exception {
    @Override
    public String toString() {
        return "Вам нет 18, данные доступны только лицам старше 18 лет";
    }
}
