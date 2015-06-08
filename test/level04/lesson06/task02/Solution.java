package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String A = bufferedReader.readLine();
        String B = bufferedReader.readLine();
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        String C = bufferedReader.readLine();
        String D = bufferedReader.readLine();
        int c = Integer.parseInt(C);
        int d = Integer.parseInt(D);

        int r3 = max(max(a,b), max(c,d));

        System.out.println(r3);
    }

    public static int max(int a, int b){
        if(a>b)
            return a;
        else
            return b;
    }
}
