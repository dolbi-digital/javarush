package com.javarush.test.level14.lesson08.bonus01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        //Add your code here
        try{
            BufferedReader reader = new BufferedReader(new FileReader("C:/1.txt"));
            throw new FileNotFoundException();
        }catch (FileNotFoundException e){
            exceptions.add(e);
        }

        try{
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(0, 33);
            list.get(444);
        }catch (IndexOutOfBoundsException e){
            exceptions.add(e);
        }

        try{
            BufferedReader reader = new BufferedReader(new FileReader("C:/1.txt"));
            throw new IOException();
        }catch (IOException e){
            exceptions.add(e);
        }

        try{
            URL url = new URL("dsfsd");
        }catch (MalformedURLException e){
            exceptions.add(e);
        }

        try{
            int a = 6;
            int b = 7;
            int c = a/b/0;
        }catch (ArithmeticException e){
            exceptions.add(e);
        }

        try {
            int[] numbs = new int[-1];

        }catch(NegativeArraySizeException e) {
            exceptions.add(e);
        }

        try {
            throw new UnsupportedOperationException("Invalid operation for sorted list.");
        }catch(UnsupportedOperationException e) {
            exceptions.add(e);
        }

        try {
            throw new SecurityException("Hmmm maybe SecurityException");
        } catch (SecurityException e) {
            exceptions.add(e);
        }

        try {
            throw new TimeoutException();
        } catch (TimeoutException e) {
            exceptions.add(e);
        }
    }
}
