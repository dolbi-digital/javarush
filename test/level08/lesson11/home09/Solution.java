package com.javarush.test.level08.lesson11.home09;

import java.util.Date;
 
/*
 
Работа с датой
 
Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
 
Пример:
 
JANUARY 1 2000 = true
 
JANUARY 2 2020 = false
 
*/

public class Solution {

    public static void main(String[] args) {
        isDateOdd("JANUARY 1 2015");
    }
    public static boolean isDateOdd(String date) {
        Date startYearDate = new Date(date);
        startYearDate.setDate(0);
        Date currentDate = new Date();
        long msDay = 24 * 60 * 60 * 1000;
        long distance = currentDate.getTime() - startYearDate.getTime();
        int dayCount = (int)(distance / msDay);
        return (dayCount % 2 != 0) ? true : false;
    }
}