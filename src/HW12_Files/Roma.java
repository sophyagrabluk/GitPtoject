package HW12_Files;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Roma {
    public static void main(String[] args) throws IOException {
        //В задании приложен файл Ромео и Джульетта на английском, вычитать его в Idea.
        //Проанализировать и записать в другой файл самое длинное слово.
        FileReader fileReader = new FileReader("C://TMS/romeo-and-juliet.txt");
        int i = -1;
        StringBuilder romeo = new StringBuilder();
        while ((i = fileReader.read()) != -1) {
            romeo.append((char) i);
        }
        fileReader.close();

        String romLJul = romeo.toString(); // преобразовали стрингБилдер в строку

        String [] word = romLJul.split(" ");
        String longestWord = " ";
        for (int x = 0; x < word.length; x++) {
            if (word[x].length() >= longestWord.length()) {
                longestWord = word[x];
            }
        }
        System.out.println(longestWord);
    }
}
