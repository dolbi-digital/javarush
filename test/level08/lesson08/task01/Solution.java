package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> set = new HashSet<String>();
        set.add("Лила");
        set.add("Люда");
        set.add("Лора");
        set.add("Люк");
        set.add("Ллейс");
        set.add("Лайка");
        set.add("Ложка");
        set.add("Лимон");
        set.add("Лопух");
        set.add("Лизун");

        set.add("Люс");
        set.add("Лама");
        set.add("Лаунч");
        set.add("Лира");
        set.add("Лада");
        set.add("Лампочка");
        set.add("Люстра");
        set.add("Лиса");
        set.add("Лань");
        set.add("Лорд");
        return set;
    }
}
