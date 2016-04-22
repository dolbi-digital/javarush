package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        ArrayList<String> list = new ArrayList();
        while(reader.ready()){
            list.add(reader.readLine());
        }

        Map<String, Double> map = new HashMap<String, Double>();

        for(int i = 0; i < list.size(); i++){
            String[] string = list.get(i).split(" ");
            if(map.containsKey(string[0])){
                Double sum = map.get(string[0]) + Double.parseDouble(string[1]);
                map.put(string[0], sum);
            }
            else{
                map.put(string[0], Double.valueOf(string[1]));
            }
        }

        Double max = map.get(0);
        System.out.println(max);
//        for(Map.Entry<String, Double> pair : map.entrySet()){
//            if(max > pair.getValue()){
//                max = pair.getValue();
//            }
//        }

        System.out.println(max);

        for(Map.Entry<String, Double> pair : map.entrySet()){
            String key = pair.getKey();
            Double value = pair.getValue();
            System.out.println(key + " " + value);
        }

        reader.close();

    }
}