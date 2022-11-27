package HW17_Regex;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsersInformation {
    public static void main(String[] args) throws IOException {
        // Программа на вход получает путь к файлу (формат тхт). Необходимо извлечь информацию.
        FileReader fileReader = new FileReader("C://TMS/regexInfo.txt");
        int i = -1;
        StringBuilder allInfo = new StringBuilder();
        while ((i = fileReader.read()) != -1) {
            allInfo.append((char) i);
        }
        fileReader.close();
        //  Извлеченную информацию необходимо сохранить в следующую структуру данных:
        // Map, где ключ типа String – это что сохраняем(email, document number, phone number),значение типа String с информацией.
        // В конце вывести все найденные элементы Map.
        HashMap<String, String> usersMap = new HashMap<>();
        Pattern documentPattern = Pattern.compile("[0-9]{4}-[0-9]{4}-[0-9]{2}");
        Matcher documentMatcher = documentPattern.matcher(allInfo);
        ArrayList<String> infoDoc = new ArrayList<>();
        while (documentMatcher.find()) {
            infoDoc.add(documentMatcher.group());
        }
        usersMap.put("document number", infoDoc.toString());

        Pattern phonePattern = Pattern.compile("[+][(][0-9]{2}[)][0-9]{7}");
        Matcher phoneMatcher = phonePattern.matcher(allInfo);
        ArrayList<String> infoPhone = new ArrayList<>();
        while (phoneMatcher.find()) {
            infoPhone.add(phoneMatcher.group());
        }
        usersMap.put("phone number", infoPhone.toString());

        Pattern emailPattern = Pattern.compile("[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.[a-zA-Z0-9_-]+");
        Matcher emailMatcher = emailPattern.matcher(allInfo);
        ArrayList<String> infoMail = new ArrayList<>();
        while (emailMatcher.find()) {
            infoMail.add(emailMatcher.group());
        }
        usersMap.put("email", infoMail.toString());

        System.out.println(usersMap);
    }
}
git rm --cached UsersInformation.java
