package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{

    public static void main(String[] args)
    {
        Human human = new Human("Dima", 13, true);
        System.out.println(human);
    }

    public static class Human
    {
        private String name;
        private String surname;
        private int age;
        private boolean sex;
        private String mother;
        private String father;

        public Human()
        {

        }

        public Human(String name)
        {
            this.name = name;
        }

        public Human(String name, String mother, String father)
        {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        public Human(int age)
        {
            this.age = age;
        }

        public Human(String name, boolean sex)
        {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, String surname)
        {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, int age, boolean sex)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String mother, String father, int age)
        {
            this.name = name;
            this.mother = mother;
            this.father = father;
            this.age = age;
        }

        public Human(String name, String mother, String father, boolean s)
        {
            this.name = name;
            this.mother = mother;
            this.father = father;
            sex = s;
        }

        public Human(String name, String mother, String father, String surname)
        {
            this.name = name;
            this.mother = mother;
            this.father = father;
            this.surname = surname;
        }

        @Override
        public String toString()
        {
            return name + " " + age + " " + sex;
        }

        @Override
        public boolean equals(Object o)
        {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (age != human.age) return false;
            if (sex != human.sex) return false;
            if (!name.equals(human.name)) return false;
            if (!surname.equals(human.surname)) return false;
            if (!mother.equals(human.mother)) return false;
            return father.equals(human.father);

        }

        @Override
        public int hashCode()
        {
            int result = name.hashCode();
            result = 31 * result + surname.hashCode();
            result = 31 * result + age;
            result = 31 * result + (sex ? 1 : 0);
            result = 31 * result + mother.hashCode();
            result = 31 * result + father.hashCode();
            return result;
        }
    }
}
