package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = reader.readLine();
        String name2 = reader.readLine();

        BufferedReader in  = new BufferedReader(new FileReader(name1));
        BufferedWriter out = new BufferedWriter(new FileWriter(name2));

        ArrayList<Double> floatList = new ArrayList<>();

        Scanner sc = new Scanner(in);
        sc.useLocale(new Locale("en", "en"));

        while(sc.hasNextDouble()){
            floatList.add(sc.nextDouble());
        }

        for(int i = 0; i < floatList.size();i++){
            out.write(Math.round(floatList.get(i)) + " ");
        }

        reader.close();
        out.close();
        in.close();
        sc.close();
    }
}