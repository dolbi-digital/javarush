package com.javarush.test.level06.lesson08.task05;

/* Класс StringHelper
Cделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) – возвращает строку повторенную count раз.
String multiply(String s) – возвращает строку повторенную 5 раз.
Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringHelper
{
    public static String multiply(String s) throws Exception
    {
        String result = "";
        String[] array = new String[5];
        for(int i = 0; i < 5; i++){
            array[i] = s;
            result = result + array[i];
        }
        return result;
    }

    public static String multiply(String s, int count) throws IOException
    {
        String result = "";
        String[] array = new String[count];
        for(int i = 0; i < count; i++){
            array[i] = s;
            result = result + array[i];
        }
        return result;
    }
}
