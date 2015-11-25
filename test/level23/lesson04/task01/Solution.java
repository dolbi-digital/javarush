package com.javarush.test.level23.lesson04.task01;

/* Inner
Реализовать метод getTwoSolutions, который должен возвращать массив из 2-х экземпляров класса Solution.
Для каждого экземпляра класса Solution инициализировать поле innerClasses двумя значениями.
Инициализация всех данных должна происходить только в методе getTwoSolutions.
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {

        Solution[] massiv = new Solution[2];

        Solution solution = new Solution();

        Solution.InnerClass innerClass = solution.new InnerClass();
        solution.innerClasses[0] = innerClass;
        Solution.InnerClass innerClass2 = solution.new InnerClass();
        solution.innerClasses[1] = innerClass2;

        massiv[0] = solution;

        Solution solution2 = new Solution();

        Solution.InnerClass innerClass3 = solution.new InnerClass();
        solution2.innerClasses[0] = innerClass3;
        Solution.InnerClass innerClass4 = solution.new InnerClass();
        solution2.innerClasses[1] = innerClass4;

        massiv[1] = solution2;

        return massiv;
    }
}
