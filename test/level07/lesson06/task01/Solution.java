package com.javarush.test.level07.lesson06.task01;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("dsf");
        arr.add("dsf2");
        arr.add("dsf3");
        arr.add("dsf4");
        arr.add("dsf5");
        System.out.println(arr.size());
        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}
