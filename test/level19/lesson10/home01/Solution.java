package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        ArrayList<String> list = new ArrayList();
        while(reader.ready()){
            list.add(reader.readLine());
        }

        Map<String, Double> map = new TreeMap<String, Double>();

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

        for(Map.Entry<String, Double> pair : map.entrySet()){
            String key = pair.getKey();
            Double value = pair.getValue();
            System.out.println(key + " " + value);
        }

        reader.close();
    }
}
