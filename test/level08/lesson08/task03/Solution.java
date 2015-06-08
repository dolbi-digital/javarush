package com.javarush.test.level08.lesson08.task03;

import java.util.*;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        for(int i = 1; i <= 10; i++)
        {
            map.put("Dolbi" + i, "Dima" + i);
        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for(Map.Entry<String, String> pair : map.entrySet())
        {
            if(name == pair.getValue())
            count ++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count = 0;
        for(Map.Entry<String, String> pair : map.entrySet())
        {
            if(familiya == pair.getKey())
                count ++;
        }
        return count;
    }
}
