package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        BufferedReader in = new BufferedReader(new FileReader(fileName1));
        FileWriter out = new FileWriter(fileName2);

        while(in.ready()){
            String string = in.readLine();
            string = string.replace(".", "!");
            out.write(string);
        }

        reader.close();
        in.close();
        out.close();
    }
}
