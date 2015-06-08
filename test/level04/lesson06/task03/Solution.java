package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());
        System.out.println((max(max(x, y), z)));
        System.out.println((y + x + z) - (max(max(x, y), z)) - min(min(x, y), z) );
        System.out.println(min(min(x, y), z));
    }
    public static int min(int n, int m) {
        return (n < m) ? n : m;
    }
    public static int max(int n, int m) {
        return (n > m) ? n : m;
    }
}

