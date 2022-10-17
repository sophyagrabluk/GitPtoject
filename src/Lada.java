public class Lada implements IMyFirstInterface {
    @Override
    public void on() {
        System.out.println("Заводим Ладу");
    }

    @Override
    public void stop() {
        System.out.println("Останавливаем Ладу");
    }

    @Override
    public void gaz() {
        System.out.println("Газуем Ладу");
    }
}
