public interface IMyFirstInterface {
    void on();

    void stop();

    default void gaz() {
        System.out.println("По умолчанию"); // если не будем преобразовывать
    }

}
