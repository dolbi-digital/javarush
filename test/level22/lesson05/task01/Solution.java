package com.javarush.test.level22.lesson05.task01;

import java.util.ArrayList;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {

        if(string == null || string.isEmpty()){
            throw new TooShortStringException();
        }

        int startIndex = string.indexOf(" ") + 1;
        int endIndex = 0;

        char[] array = string.toCharArray();
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        int countSpace = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]==' '){
                countSpace++;
            }
            if(countSpace == 4){
                endIndex = array.length;
            }
            if(countSpace > 4){
                endIndex = i;
                break;
            }
        }

        if(countSpace<4){
            throw new TooShortStringException();
        }

        return string.substring(startIndex, endIndex);
    }

    public static class TooShortStringException extends Exception {

    }

    public static void main(String[] args){
        String string = "JavaRush - лучший сервис обучения Java.";
        System.out.println(string);
        try {
            System.out.print(getPartOfString(string));
        } catch (TooShortStringException e) {
            e.printStackTrace();
        }
    }
}
