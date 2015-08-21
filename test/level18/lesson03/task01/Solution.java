package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String fileName = reader.readLine();
        int max = 0;
        int tmp = 0;
        FileInputStream fin = new FileInputStream(fileName);
        while(fin.available()>0)
        {
            tmp = fin.read();
            if(tmp > max)
            {
                max = tmp;
            }
        }
        System.out.println(max);
        reader.close();
        fin.close();
    }
}
