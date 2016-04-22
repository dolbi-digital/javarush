package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        FileOutputStream fileOutputStream2 = new FileOutputStream(reader.readLine());
        FileOutputStream fileOutputStream3 = new FileOutputStream(reader.readLine());

        byte[] buffer1;

        if(fileInputStream.available()%2==0){
            buffer1 = new byte[fileInputStream.available()/2];
        }
        else{
            buffer1 = new byte[fileInputStream.available()/2 + 1];
        }

        byte[] buffer2 = new byte[fileInputStream.available() - buffer1.length];

        fileOutputStream2.write(buffer1, 0, fileInputStream.read(buffer1));
        fileOutputStream3.write(buffer2, 0, fileInputStream.read(buffer2));

        reader.close();
        fileInputStream.close();
        fileOutputStream2.close();
        fileOutputStream3.close();
    }
}
