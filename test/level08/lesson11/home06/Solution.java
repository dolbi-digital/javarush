package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human child1 = new Human("child1", true, 15);
        Human child2 = new Human("child2", true, 11);
        Human child3 = new Human("child3", false, 5);

        ArrayList<Human> childs = new ArrayList<Human>();
        childs.add(child1);
        childs.add(child2);
        childs.add(child3);

        Human father = new Human("father", true, 40, childs);
        Human mother = new Human("mother", false, 40, childs);

        ArrayList<Human> parents = new ArrayList<Human>();
        parents.add(father);

        ArrayList<Human> parents2 = new ArrayList<Human>();
        parents2.add(mother);

        Human grandfather1 = new Human("grandfather1", true, 78, parents);
        Human grandfather2 = new Human("grandfather2", true, 78, parents);
        Human grandmother1 = new Human("grandmother1", false, 78, parents2);
        Human grandmother2 = new Human("grandmother2", false, 78, parents2);

        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

        System.out.println(father.toString());
        System.out.println(mother.toString());

        System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
