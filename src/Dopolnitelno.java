import java.util.Arrays;

public class Dopolnitelno {
    public static void main(String[] args) {
        // Написать метод. На вход поступает массив из неотрицательных чисел(nums[a,b…]).
        // Представьте что массив представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999).
        // Ваша задача добавить единицу к этому “числу” и на выходе вернуть исправленный массив.
        // Массив не содержит нуля в начале, кроме самого числа 0.
        getArray(new int[]{9, 7});
    }

    public static void getArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);                  //создали массив
        }
        System.out.println();

        String str = "";
        for (int i = 0; i < arr.length; i++)
            str = str + Integer.toString(arr[i]);
        System.out.println("str = " + str);           // сделали из массива строку

        Integer num = Integer.parseInt(str);          //преобразовали строку в число
        num += 1;
        System.out.println(num);                      // добавили к числу 1

    }
}
