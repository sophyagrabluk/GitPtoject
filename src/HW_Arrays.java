import java.util.Arrays;
import java.util.Scanner;

public class HW_Arrays {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

   //Массив заполняется рандомными числами
     double[] arrayrandom = new double[scanner.nextInt()];
        for (int i = 0; i < arrayrandom.length; i++) {
            arrayrandom[i] = Math.random();
            System.out.println(arrayrandom[i]);
        }

       // Массив заполняется пользователем вручную
        System.out.println("Введите размер массива:" + " ");
        int[] array = new int[scanner.nextInt()];
        System.out.println("Введите значение в каждый элемент:" + " ");
        for (int j = 0; j < array.length; j++) {
            array[j] = scanner.nextInt();
        }

        // 1. Все элементы в прямом порядке.
        System.out.print("Элементы в прямом порядке: " + Arrays.toString(array));
        System.out.println();

        // 1. Все элементы в обратном порядке
        System.out.print("Элементы в обратном порядке: ");
        for (int vv = array.length - 1; vv >= 0; vv--) {
            System.out.print(array[vv] + " ");
        }
        System.out.println();
        // 2. Найти минимальный-максимальный элементы и вывести
        // максимальный
        int maxValue = array[0];
        for (int max = 0; max < array.length; max++) {
            if (array[max] > maxValue) {
                maxValue = array[max];
            }
        }
        System.out.println("Максимальный элемент в массиве: " + maxValue);
        // минимальный
        int minValue = array[0];
        for (int min = 0; min < array.length; min++) {
            if (array[min] < minValue) {
                minValue = array[min];
            }
        }
        System.out.println("Минимальный элемент в массиве: " + minValue);

        // 3. Найти индекс минимального-максимального элементов и вывести
        // максимальный
        int m = array[0];
        int indexMax = 0;
        for (int max = 0; max < array.length; max++) {
            if (array[max] > m) {
                m = array[max];
                indexMax = max;
            }
        }
        System.out.println("Индекс максимального элемента в массиве: " + indexMax);

        // минимальный
        int n = array[0];
        int indexMin = 0;
        for (int min = 0; min < array.length; min++) {
            if (array[min] < n) {
                n = array[min];
                indexMin = min;
            }
        }
        System.out.println("Индекс минимального элемента в массиве: " + indexMin);

        // 4. Найти и вывести количество нулевых элементов.
        // Если нулевых элементов нет - вывести сообщение, что их нет
        int zero = 0;
        for (int z = 0; z < array.length; z++)
            if (array[z] == 0) {
                zero++;
                System.out.println("Количество нулевых элементов в массиве: " + zero);}
                if (zero == 0)
                    System.out.println("Нулевых элементов нет"); // как убрать "0" в консоли


        // 5. Пройти по массиву и поменять местами первый и последний, второй и предпоследний и т.д.
        for (int a = 0, b = array.length - 1; a < array.length / 2 && b / 2 >= 0; a++, b--)
        {
            int vice = array[a];
            array[a] = array[b];
            array[b] = vice;
        }
        System.out.println(Arrays.toString(array));

        // 6. Проверить, является ли массив возрастающей последовательностью
        // (каждое следующее число больше предыдущего)
        boolean result = true;
        for (int test = 1; test < array.length; test++) {
            if(array[test]<=array[test-1]){
                result = false;
                break;
            }
        }
        if(result){
            System.out.println("Последовательность возрастающая");
        } else {
            System.out.println("Последовательность не возрастающая");
        }


        // Создать двумерный массив, заполнить его числами. Добавить к каждому значению число,
        // которое пользователь будет вводить с консоли. Найти сумму всех получившихся элементов.
        int[][] twoArray = {{1, 2}, {3, 4}, {5, 6}};
              System.out.println("Заданный массив " + Arrays.deepToString(twoArray));
        int resultTwo = 0;
        for (int x = 0; x < twoArray.length; x++) {
            for (int y = 0; y < twoArray[x].length; y++) {
                System.out.print(twoArray[x][y] + "+");
                resultTwo = twoArray[x][y] + scanner.nextInt();
                System.out.println("=" + resultTwo);
                twoArray[x][y] = resultTwo;
            }
        }
        System.out.println("Новый массив " + Arrays.deepToString(twoArray));

       int sum = 0;
        for (int sumx = 0; sumx < twoArray.length; sumx++) {
            for (int sumy = 0; sumy < twoArray[sumx].length; sumy++) {
                sum = sum + twoArray[sumx][sumy];

            }
        }System.out.println("Сумма всех элементов массива = " + sum);


        //Шахматная доска
        //Создать программу для раскраски шахматной доски с помощью цикла. Создать двумерный массив String'ов 8х8.
        //С помощью циклов задать элементам циклам значения B(Black) или W(White).
        String[][] chess = new String[8][8];
        for (int k = 0; k < chess.length; k++) {
            for (int q = 0; q < chess[k].length; q++) {
                if ((k + q) % 2 == 0)
                    System.out.print("W ");
                 else
                    System.out.print("B ");
                System.out.println();
            }
        }


    }
}
