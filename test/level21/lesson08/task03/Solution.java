package com.javarush.test.level21.lesson08.task03;

/* Запретить клонирование
Разрешите клонировать класс А
Запретите клонировать класс B
Разрешите клонировать класс C
Метод main не участвует в тестировании.
*/
public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public B clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException();
        }
    }

    public static class C extends B {
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        private C duplicate(C c) {
            return new C(c.getI(), c.getJ(), c.getName());
        }

        @Override
        public C clone() throws CloneNotSupportedException {
            return duplicate(this);
        }

        public static void main(String[] args) throws CloneNotSupportedException {
            A a = new A(1, 2);
            A cloneA = null;
            cloneA = (A) a.clone();
            System.out.println(a);
            System.out.println(cloneA);

            B b = new B(1, 2, "B");
            B cloneB = null;
            cloneB = (B) b.clone();
            System.out.println(b);
            System.out.println(cloneB);

            C c = new C(1, 2, "C");
            C cloneC = null;
            cloneC = (C) c.clone();
            System.out.println(c);
            System.out.println(cloneC);
        }
    }
}
