package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int r = 0;
        if ((a<b && a>c)||(a>b && a<c))
            r=a;
        if ((b<a && b>c)||(b>a && b<c))
            r=b;
        if ((c<a && c>b)||(c>a && c<b))
            r=c;
        System.out.println(r);
    }
}
