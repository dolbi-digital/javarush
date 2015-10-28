package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader numbersReader = new BufferedReader(new FileReader(fileName));
        List<Integer> list = new ArrayList<Integer>();
        int number = 0;

        while(numbersReader.ready()) {
            number = Integer.parseInt(numbersReader.readLine());
            if(number%2 == 0){
                list.add(number);
            }
        }

        for(int i=list.size()-1; i>0; i--){
            for(int j=0; j<i; j++){

                int temp_j = list.get(j);
                int temp_j1 = list.get(j + 1);

                if (temp_j > temp_j1){

//                    int temp = temp_j;
//                    temp_j = temp_j1;
//                    temp_j1 = temp;

                    list.set(j, temp_j1);
                    list.set(j + 1, temp_j);
                }
            }
        }

        //list.forEach(System.out::println);
        list.forEach((x) -> System.out.println(x));

        numbersReader.close();
    }
}