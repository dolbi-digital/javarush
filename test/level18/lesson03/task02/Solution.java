package com.javarush.test.level18.lesson03.task02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String fileName = reader.readLine();
        int min = 1000;
        int tmp = 0;
        FileInputStream fin = new FileInputStream(fileName);
        while(fin.available()>0)
        {
            tmp = fin.read();
            if(tmp < min)
            {
                min = tmp;
            }
        }
        System.out.println(min);
        reader.close();
        fin.close();
    }
}

