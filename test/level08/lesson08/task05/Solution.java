package com.javarush.test.level08.lesson08.task05;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("surname1", "name1");
        map.put("surname2", "name2");
        map.put("surname3", "name3");
        map.put("surname4", "name4");
        map.put("surname5", "name5");
        map.put("surname1", "name1");
        map.put("surname1", "name1");
        map.put("surname1", "name1");
        map.put("surname1", "name1");
        map.put("surname1", "name1");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {

        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
