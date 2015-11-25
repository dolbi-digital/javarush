package com.javarush.test.level22.lesson18.big01;

/**
 «адание 10
 “ак же нам понадоб€тс€ методы дл€ управлени€ фигуркой.
 ƒобавь в класс Figure методы:
 left() - дл€ движени€ фигурки влево.
 right() - дл€ движени€ фигурки вправо.
 down() - дл€ движени€ фигурки вниз.
 up() - дл€ движени€ фигурки вверх.
 downMaximum() - падение фигурки в низ до дна.
 rotate() - дл€ поворота фигурки вокруг главной диагонали.
 boolean isCurrentPositionAvailable() - проверка - может ли фигурка быть помещена в текущую позицию. ƒл€ теста захардкодь результат в true.
 landed() - вызываетс€, когда фигурка достигла дна или уперлась в другую фигурку
 ¬се ее зан€тые клетки теперь должны добавитьс€ в Field.
 */
public class Figure {
    private int x;
    private int y;
    private int[][] matrix;

    public Figure(int x, int y, int[][] matrix) {
        this.x = x;
        this.y = y;
        this.matrix = matrix;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void left(){

    }

    public void right(){

    }

    public void down(){

    }

    public void up(){

    }

    public void downMaximum(){

    }

    public void rotate(){

    }

    public boolean isCurrentPositionAvailable(){
        return true;
    }

    public void landed(){

    }
}
