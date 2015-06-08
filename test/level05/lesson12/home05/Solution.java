package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String number = null;
        int sum = 0;
        int a = 0;
        while(true){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            number = reader.readLine();
            if(number.equals("сумма"))
            {
                break;
            }
            a = Integer.parseInt(number);
            sum+=a;
        }
        System.out.print(sum);
    }
}
