package HW15_Stream;

import java.util.*;
import java.util.stream.Collectors;

public class IDName {
    public static void main(String[] args) {
        //Создать набор данных в формате id-name, сохраненный в Map.
        HashMap<Integer, String> users = new HashMap<>();
        users.put(1, "Alex");
        users.put(2, "Marie");
        users.put(3, "Tim");
        users.put(4, "Lizzy");
        users.put(5, "Den");
        users.put(6, "Kate");
        users.put(7, "Nick");
        users.put(8, "Sophie");
        users.put(9, "Charles");
        users.put(10, "Helen");
        users.put(11, "Andrew");
        users.put(12, "Elly");
        users.put(13, "Rick");
        users.put(14, "Emma");

        //Необходимо отобрать из этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
        //Среди отобранных значений отобрать только те, которые имеют нечетное количество букв в имени.
        List<Map.Entry<Integer, String>> usersStream = users.entrySet().stream()
                .filter(id -> (id.getKey() == 1) || (id.getKey() == 2) || (id.getKey() == 5) || (id.getKey() == 8) || (id.getKey() == 9))
                .filter(name -> name.getValue().length() % 2 != 0).collect(Collectors.toList());
        System.out.println(usersStream);

        //После чего вернуть список List имен, записанных буквами задом наперед.
        //String inputString = "java";
        //String reversedString = new StringBuffer(inputString).reverse().toString();

    }
}
