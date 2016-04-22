package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in;
        FileOutputStream out;
        String fileName;
        Set<File> files = new LinkedHashSet<>();

        while(!(fileName = reader.readLine()).equals("end")){
            File file = new File(fileName);
            files.add(file);
        }

        Iterator<File> iterator = files.iterator();
        String path = iterator.next().getAbsolutePath();

        String finalFile = path.replaceAll(".part\\d+", "");

        System.out.println(finalFile);
        out = new FileOutputStream(finalFile);

        for(File file : files){
            in = new FileInputStream(file);
            byte[] buf = new byte[in.available()];
            in.read(buf);
            out.write(buf);
            in.close();
        }

        out.close();
        reader.close();
    }
}
