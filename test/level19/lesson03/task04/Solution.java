package com.javarush.test.level19.lesson03.task04;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные одного человека.
*/

public class Solution {
    public static class PersonScannerAdapter implements PersonScanner{

        private Scanner scanner;
        public PersonScannerAdapter(Scanner scanner) {
            this.scanner = scanner;
        }

        @Override
        public Person read() throws IOException
        {
            String[] split = scanner.nextLine().split(" ");
            Date date = new Date();
            SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");

            String dateStr = split[3] + " " + split[4] + " " + split[5];
            try {
                date = format.parse(dateStr);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            Person person = new Person(split[1], split[2], split[0], date);
            return person;
        }

        @Override
        public void close() throws IOException {
            this.scanner.close();
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("C:/scanner.txt"), "Cp1251");
        PersonScannerAdapter adapter = new PersonScannerAdapter(scanner);
        System.out.println(adapter.read());
        System.out.println(adapter.read());
        System.out.println(adapter.read());
        adapter.close();
    }
}
