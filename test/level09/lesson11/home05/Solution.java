package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        char[] chars = string.toCharArray();

        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> consonants = new ArrayList<>();

        for(int i = 0; i < chars.length; i++){
            if(isVowel(chars[i])){
                vowels.add(chars[i]);
            }
            else consonants.add(chars[i]);
        }

        for(Character character : vowels){
            System.out.print(character + " ");
        }
        System.out.println();
        for(Character character : consonants){
            System.out.print(character + " ");
        }
     }

    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
