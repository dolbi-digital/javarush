package com.javarush.test.level16.lesson03.task03;

import java.util.ArrayList;
import java.util.List;

/* Список и нити
В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            SpecialThread1 st = new SpecialThread1();
            st.run();
            list.add(new Thread(st));
        }
    }

    public static class SpecialThread1 implements Runnable {
        public void run() {
            System.out.println("it's run method inside SpecialThread");
        }
    }
}
