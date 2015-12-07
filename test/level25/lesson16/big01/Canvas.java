package com.javarush.test.level25.lesson16.big01;

/**
 * Задание 8
 Теперь займемся классом Canvas.
 Он у нас будет содержать матрицу, куда мы будем рисовать.
 У матрицы есть ширина и высота.
 А еще будем в ней хранить не числа(int), а символы (char).
 Надо:
 а) Добавить в класс две переменные width и height
 б) Добавить в класс переменную matrix (char[][])
 в) Добавь геттеры для них
 г) В конструкторе проинициализируй матрицу
 */
public class Canvas {
    private int height;
    private int width;
    private char[][] matrix;

    public Canvas(int height, int width) {
        this.height = height;
        this.width = width;
        this.matrix = new char[height][width];
    }

    public Canvas(char[][] matrix) {
        this.matrix = matrix;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public char[][] getMatrix() {
        return matrix;
    }
}
