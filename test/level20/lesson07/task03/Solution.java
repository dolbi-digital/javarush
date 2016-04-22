package com.javarush.test.level20.lesson07.task03;

import java.io.*;
import java.util.List;

/* Externalizable Person
Класс Person должен сериализоваться с помощью интерфейса Externalizable.
Подумайте, какие поля не нужно сериализовать.
Исправьте ошибку сериализации.
Сигнатуры методов менять нельзя.
*/
public class Solution {
    public static class Person implements Externalizable {
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Person() {

        }

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(this.firstName);
            out.writeObject(this.lastName);
            out.writeInt(this.age);
            out.writeObject(this.mother);
            out.writeObject(this.father);
            out.writeObject(this.children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            firstName = (String) in.readObject();
            lastName = (String) in.readObject();
            age = in.readInt();
            father = (Person)in.readObject();
            mother = (Person)in.readObject();
            children = (List<Person>)in.readObject();
        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", mother=" + mother +
                    ", father=" + father +
                    ", children=" + children +
                    '}';
        }
    }

    public static void main(String [] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Dima", "Dolbi", 30);
        FileOutputStream fileOutputStream = new FileOutputStream("C://test.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        person.writeExternal(objectOutputStream);

        FileInputStream fileInputStream = new FileInputStream("C://test.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person newPerson = new Person();
        newPerson.readExternal(objectInputStream);

        System.out.println(person.toString());
        System.out.println(newPerson.toString());
    }
}
