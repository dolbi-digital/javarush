package com.javarush.test.level08.lesson08.task05;

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
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Литвиненко", "Сергей");
        hashMap.put("Порошенко", "Петр");
        hashMap.put("Яценюк", "Арсений");
        hashMap.put("Литвиненко2", "Сергей");
        hashMap.put("Литвиненко3", "Сергей");
        hashMap.put("Литвиненко4", "Сергей");
        hashMap.put("Литвиненко5", "Сергей");
        hashMap.put("Ярош", "Дмитрий");
        hashMap.put("Литвиненко6", "Сергей");
        hashMap.put("Литвиненко7", "Сергей");
        return hashMap;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код

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

    public static void  main(String[] args){
        System.out.println(createMap());
    }
}
