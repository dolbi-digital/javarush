package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("MAY 1 1980"));
        map.put("Сталлоне2", new Date("JUNE 1 1980"));
        map.put("Сталлоне3", new Date("JUNE 1 1980"));
        map.put("Сталлоне4", new Date("AUGUST 1 1980"));
        map.put("Сталлоне5", new Date("JULY 1 1980"));
        map.put("Сталлоне6", new Date("MAY 1 1980"));
        map.put("Сталлоне7", new Date("MAY 1 1980"));
        map.put("Сталлоне8", new Date("JUNE 1 1980"));
        map.put("Сталлоне9", new Date("MAY 1 1980"));
        map.put("Сталлоне10", new Date("JUNE 1 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            int month = iterator.next().getValue().getMonth() + 1;
            if (6 <= month && month <= 8)
            {
                iterator.remove();
            }
        }

    }
}
