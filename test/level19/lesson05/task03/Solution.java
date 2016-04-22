package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        BufferedReader in = new BufferedReader(new FileReader(fileName1));
        FileWriter out = new FileWriter(fileName2);

        int count = 0;

        while(in.ready()){
            String string = in.readLine();
            Pattern p = Pattern.compile("\\b\\d+\\b");
            Matcher m = p.matcher(string);
            while (m.find()) {
                out.write(m.group() + " ");
            }
        }
        reader.close();
        in.close();
        out.close();
    }
}
