package com.javarush.test.level04.lesson10.task05;
 
/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while. Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //создаём переменную i1, по которой будет идти
        //внешний цикл
        int i1 = 1;

        //запускаем внешний цикл
        //он будет обозначать номера строк
        while (i1<=10){
            //внутри цикла каждый раз в начале устанавливаем
            //переменную i2 на 1, чтобы номера колонок
            //начинались с 1
            int i2 = 1;

            //бежим по циклу создавая колонки путем
            //умножения номера строки на всё увеличивающиеся
            //номера колонок и сразу печатаем их
            while (i2<=10){
                System.out.print((i1 * i2) + " ");
                i2++;
            }

            //по кончании создания колонок в одной строке, переводим
            //строку вниз и начинаем заново с нового номера строки
            System.out.println("");
            i1++;
        }

    }
}