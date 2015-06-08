package com.javarush.test.level08.lesson08.task05;

import java.util.Date;
import java.util.HashMap;
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
        map.put("Сталлоне", "Сильвестр");
        map.put("Сталлоне2", "Сильвестр2");
        map.put("Сталлоне3", "Сильвестр3");
        map.put("Сталлоне", "Сильвестр");
        map.put("Сталлоне5", "Сильвестр5");
        map.put("Сталлоне6", "Сильвестр6");
        map.put("Сталлоне", "Сильвестр");
        map.put("Сталлоне8", "Сильвестр8");
        map.put("Сталлоне9", "Сильвестр9");
        map.put("Сталлоне10", "Сильвестр10");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {

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
