package com.javarush.test.level08.lesson08.task05;

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
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Фамилия1", "Дима");
        map.put("Фамилия2", "Имя");
        map.put("Фамилия3", "Имя2");
        map.put("Фамилия4", "Имя");
        map.put("Фамилия5", "Имя3");
        map.put("Фамилия6", "Имя");
        map.put("Фамилия7", "Имя");
        map.put("Фамилия8", "Имя");
        map.put("Фамилия9", "Имя");
        map.put("Фамилия10", "Имя");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        HashMap<String, String> copy1 = new HashMap<String, String>(map);
        HashMap<String, String> copy2 = new HashMap<String, String>(map);

        for(Map.Entry<String, String> pair : copy1.entrySet()){
            copy2.remove(pair.getKey());
            if (copy2.containsValue(pair.getValue())) {
                removeItemFromMapByValue(map, pair.getValue());
            }
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

    public static void main(String[] args){
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " " + value);
        }
    }
}
