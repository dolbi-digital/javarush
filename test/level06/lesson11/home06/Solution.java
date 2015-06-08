package com.javarush.test.level06.lesson11.home06;

/* KissMyShinyMetalAss
Создай класс с именем KissMyShinyMetalAss. Создай объект этого класса, выведи его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        KissMyShinyMetalAss ass = new KissMyShinyMetalAss("sdafas");
        System.out.println(ass);
    }

    public static class KissMyShinyMetalAss
    {
        private String name;
        public KissMyShinyMetalAss(String name){
            this.name = name;
        }
    }

}
