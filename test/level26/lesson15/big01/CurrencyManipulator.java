package com.javarush.test.level26.lesson15.big01;

import java.util.HashMap;
import java.util.Map;

/**Задание 3
 1. Создадим класс CurrencyManipulator, который будет хранить всю информацию про выбранную валюту.
 String currencyCode - код валюты, например, USD. Состоит из трех букв
 Map<Integer, Integer> denominations - это Map<номинал, количество>
 Чтобы можно было посмотреть, к какой валюте относится манипулятор, добавим геттер для currencyCode
 Очевидно, что манипулятор никак не может функционировать без названия валюты,
 поэтому добавим конструктор с этим параметром и проинициализируем currencyCode

 2. Валют может быть несколько, поэтому нам понадобится фабрика, которая будет создавать и хранить манипуляторы.
 Создадим класс CurrencyManipulatorFactory со статическим методом getManipulatorByCurrencyCode(String currencyCode).
 В этом методе будем создавать нужный манипулятор, если он еще не существует, либо возвращать ранее созданный.
 Подумайте, где лучше хранить все манипуляторы.
 Сделайте так, чтобы невозможно было создавать объекты CurrencyManipulatorFactory класса
 */
public class CurrencyManipulator {
    private String currencyCode;
    private Map<Integer, Integer> denominations = new HashMap<Integer, Integer>();

    public CurrencyManipulator(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyCode(){
        return currencyCode;
    }

    public void addAmount(int denomination, int count) {
        if (denominations.containsKey(denomination)) {
            denominations.put(denomination, denominations.get(denomination) + count);
        } else {
            denominations.put(denomination, count);
        }
    }

    public int getTotalAmount(){
        int sum=0;
        for(Map.Entry<Integer, Integer> pair : denominations.entrySet()){
            sum = sum + (pair.getKey() * pair.getValue());
        }
        return sum;
    }
}
/*

****************************************************************
Задание 5
1.В предыдущем таске мы реализовали основную логику операции DEPOSIT.
Но посмотреть результат так и не удалось.
Поэтому создадим в манипуляторе метод int getTotalAmount(), который посчитает общую сумму денег для выбранной валюты.

2. Добавим вызов метода getTotalAmount() в метод main.
Всё работает верно? Тогда движемся дальше.
Видно, что метод getTotalAmount() считает то, что нам необходимо для операции INFO.
Поэтому пришло время небольшого рефакторинга.
!!Читайте паттерн Command.
Однако, перед рефакторингом нужно еще разобраться в одном вопросе. Но об этом не сейчас.
 */