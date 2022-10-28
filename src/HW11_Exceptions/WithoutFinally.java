package HW11_Exceptions;
public class WithoutFinally {
    public static void main(String[] args) {
        try {
            int x = 99;
            int y = x / 0;
        } catch (ArithmeticException e) {
            for (;;);
        } finally {
            System.out.println("The finally code is working");
        }
    }
}
