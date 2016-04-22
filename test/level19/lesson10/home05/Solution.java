package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader(args[0]));
        FileWriter out = new FileWriter(args[1]);

        String line;
        String[] words;
        while ((line = in.readLine()) != null){
            words = line.split(" ");
            for (String word : words){
                if (word.matches("(([a-zA-Z]+)(\\d+)([a-zA-Z0-9]*)|(\\d+)([a-zA-Z]+([a-zA-Z0-9]*))|([a-zA-Z]+)(\\d+)([a-zA-Z]+))")){  //".*[0-9].*"  \w*\d\w*  \w*\d\w*
                    System.out.print(word + " ");
                    out.write(word + " ");
                }
            }
        }

        in.close();
        out.close();
    }
}