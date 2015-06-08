package com.javarush.test.level07.lesson06.task02;

/* 5 строчек: «101», «102», «103», «104», «105»
1. Создай список строк.
2. Добавь в него 5 строчек: «101», «102», «103», «104», «105».
3. Удали первую, среднюю и последнюю.
4. Используя цикл выведи на экран его содержимое, каждое значение с новой строки.
5. Выведи его размер. (После удаления одного элемента индексы остальных меняются.
Например, если удалить 0-й элемент, то тот, который был 1-м, станет 0-м. И т.д.)
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("101");
        arr.add("102");
        arr.add("103");
        arr.add("104");
        arr.add("105");
        arr.remove(0);
        arr.remove(1);
        arr.remove(2);

        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
        System.out.println(arr.size());
    }
}
