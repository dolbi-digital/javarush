package com.javarush.test.level27.lesson15.big01;

import com.javarush.test.level27.lesson15.big01.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 1. Мы много работаем с консолью. Пора создать единую точку взаимодействия.
 Создайте класс ConsoleHelper с единственным BufferedReader, через который будете работать с консолью.
 Запомните, этот класс не хранит никаких данных и состояний, поэтому все методы будут статическими.
 Создайте в нем три метода:
 -writeMessage(String message) - для вывода message в консоль
 -String readString() - для чтения строки с консоли
 -List<Dish> getAllDishesForOrder() - просит ползователя выбрать блюдо и добавляет его в список. Введенное 'exit' означает завершение заказа.
 исключения пробрасывайте выше, на этом уровне не понятно, что с ними делать.

 2. Отрефакторьте код - работа с консолью должна быть только через класс ConsoleHelper
 */
public class ConsoleHelper {
    public static void writeMessage(String message){
        System.out.println(message);
    }

    public static String readString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        return line;
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        writeMessage("Choose dish: " + Dish.allDishesToString());
        List<Dish> dishes = new ArrayList<>();
        while (true) {
            String choice = readString();
            if (choice.equals("exit")) {
                break;
            }
            dishes.add(Dish.valueOf(choice));
        }
        return dishes;
    }
}
