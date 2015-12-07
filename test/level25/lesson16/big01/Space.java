package com.javarush.test.level25.lesson16.big01;

import java.util.ArrayList;

public class Space {
    private int height;
    private int width;
    private SpaceShip ship;
    private ArrayList<Ufo> ufos = new ArrayList<Ufo>();
    private ArrayList<Rocket> rockets = new ArrayList<Rocket>();;
    private ArrayList<Bomb> bombs = new ArrayList<Bomb>();;

    public Space(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public SpaceShip getShip() {
        return ship;
    }

    public ArrayList<Ufo> getUfos() {
        return ufos;
    }

    public ArrayList<Rocket> getRockets() {
        return rockets;
    }

    public ArrayList<Bomb> getBombs() {
        return bombs;
    }

    public void setShip(SpaceShip ship) {
        this.ship = ship;
    }

    public void run(){

    }

    public void draw(){

    }

    public void sleep(int ms){

    }

    public static void main(String[] args){

    }
}

/*
* Задание 4
Для чего нам нужен класс Space?
Чтобы хранить в себе все объекты и управлять их взаимодействием.
А какие параметры должны у него быть?
width (ширина), height (высота).
А еще?
а) ship (космический корабль),
б) список для хранения всех НЛО -  ufos (ArrayList<Ufo>)
в) список для хранения всех ракет -  rockets (ArrayList<Rocket>)
г) список для хранения всех бомб -  bombs (ArrayList<Bomb>)

Задание:
Добавь все эти переменные к классу Space.
Инициализируй коллекции.
И не забудь добавить переменным getter'ы, а для ship еще и setter!

А что должен содержать конструктор?
Достаточно будет width и height*/
/*

Задание 5
Чего не хватает классу Space?
Правильно - методов run() и draw().
run управляет всей логикой игры, если ты помнишь.
А draw отвечает за отрисовку очередного "кадра".

А еще нам пригодится метод sleep(int ms)
Создай их.
 */