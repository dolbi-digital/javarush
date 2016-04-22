package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());

        byte[] buffer = new byte[fileInputStream.available()];
        byte[] buffer2 = new byte[buffer.length];

        int count = fileInputStream.read(buffer);
        for(int i = 0; i < buffer.length; i++){
            buffer2[buffer.length - 1 - i] = buffer[i];
        }

        fileOutputStream.write(buffer2, 0, count);

        reader.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
