package HW12_Files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Roma {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C://TMS/romeo-and-juliet.txt");
        int i = -1;
        StringBuilder romeo = new StringBuilder();
        while ((i = fileReader.read()) != -1) {
            romeo.append((char) i);
        }
        fileReader.close();

        String romeoJuletta = romeo.toString().replaceAll("\\W", " ");// \\W - значит не буквенно-цифровые символы
        String[] word = romeoJuletta.split(" ");
        String longestWord = " ";
        for (int x = 0; x < word.length; x++) {
            if (word[x].length() >= longestWord.length()) {
                longestWord = word[x];
            }
        }
        System.out.println(longestWord);

        FileWriter fileWriter = new FileWriter("C://TMS/longest_word_in_RJ.txt");
        fileWriter.write(longestWord);
        fileWriter.close();
    }
}
