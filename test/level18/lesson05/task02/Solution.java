package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        int count = 0;
        int comma = 0;
        FileInputStream fileInputStream = new FileInputStream(fileName);
        while(fileInputStream.available()>0){
            comma = fileInputStream.read();
            if(comma == 44){
                count +=1;
            }
        }
        System.out.println(count);
        reader.close();
        fileInputStream.close();
    }
}
