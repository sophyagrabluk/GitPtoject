package HW15_Stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        users.put(13, "Richard");
        users.put(14, "Emma");

        //Необходимо отобрать из этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
        //Среди отобранных значений отобрать только те, которые имеют нечетное количество букв в имени.
        //После чего вернуть список List имен, записанных буквами задом наперед.
        List < String > usersList = users.entrySet().stream()
                .filter(id -> (id.getKey() == 1) || (id.getKey() == 2) || (id.getKey() == 5) || (id.getKey() == 8) || (id.getKey() == 9) || (id.getKey() == 13))
                .map(Map.Entry::getValue).filter(name -> name.length() % 2 != 0)
                .map(name -> String.valueOf(new StringBuilder(name).reverse()))
                .toList();
        System.out.println(usersList);
    }
}
