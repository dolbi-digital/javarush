package com.javarush.test.level20.lesson04.task02;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* Как сериализовать JavaRush?
Сделайте так, чтобы сериализация класса JavaRush была возможной
*/
public class Solution {
    public static class JavaRush implements Serializable{
        public List<User> users = new ArrayList<>();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        JavaRush javaRush = new JavaRush();
        User dima = new User();
        dima.setFirstName("Dima");
        dima.setLastName("Dolbi");
        dima.setBirthDate(new Date());
        dima.setMale(true);
        dima.setCountry(User.Country.UKRAINE);
        User dima2 = new User();
        dima.setFirstName("Dima2");
        dima.setLastName("Dolbi2");
        dima.setBirthDate(new Date());
        dima.setMale(true);
        dima.setCountry(User.Country.RUSSIA);
        javaRush.users.add(dima);
        javaRush.users.add(dima2);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:/javarush.dat"));
        objectOutputStream.writeObject(javaRush);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:/javarush.dat"));
        Object object = objectInputStream.readObject();
        objectInputStream.close();

        JavaRush newJavaRush = (JavaRush) object;
        for(User user : newJavaRush.users){
            System.out.println(newJavaRush.users.size());
            System.out.println(newJavaRush.users.get(1).getFirstName());
            System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getBirthDate() + " " + user.getCountry() + " " + user.isMale());
        }
    }
}
