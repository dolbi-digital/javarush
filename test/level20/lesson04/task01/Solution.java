package com.javarush.test.level20.lesson04.task01;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Как сериализовать?
Сделайте так, чтобы сериализация класса Human была возможной
*/
public class Solution {
    public static class Human implements Serializable{
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Human human = new Human();

        FileOutputStream fileOutputStream = new FileOutputStream("human.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(human);
        fileOutputStream.close();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("human.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = objectInputStream.readObject();
        fileInputStream.close();
        objectInputStream.close();

        Human newHuman = (Human) object;
    }
}
