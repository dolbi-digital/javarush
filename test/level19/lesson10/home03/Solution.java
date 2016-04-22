package com.javarush.test.level19.lesson10.home03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        List<String> lines = new ArrayList<String>();
        while(reader.ready()){
            lines.add(reader.readLine());
        }
        reader.close();

        for(int i = 0; i < lines.size(); i++){
            String[] line = lines.get(i).split(" ");

            StringBuilder name = new StringBuilder();
            for(int j = 0; j < line.length-3; j++){
                if(j == line.length - 4)
                    name.append(line[j]);
                else
                    name.append(line[j] + " ");
            }

            int year = Integer.valueOf(line[line.length-1]);
            int month = Integer.valueOf(line[line.length-2]) - 1;
            int day = Integer.valueOf(line[line.length-3]);

            Date birthDay = new GregorianCalendar(year, month, day).getTime();
            PEOPLE.add(new Person(name.toString(), birthDay));

        }

        for(int i = 0; i < PEOPLE.size(); i++){
            System.out.println(PEOPLE.get(i).getName() + " " + PEOPLE.get(i).getBirthday());
        }
    }
}
