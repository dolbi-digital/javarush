package com.javarush.test.level17.lesson04.task04;

/* Синхронизированный президент
И снова Singleton паттерн - синхронизация в статическом блоке
Внутри класса OurPresident в статическом блоке создайте синхронизированный блок.
Внутри синхронизированного блока инициализируйте president.
*/

public class Solution {
    public static class OurPresident {

        private static OurPresident president;

        private OurPresident() {
        }

        public static synchronized OurPresident getOurPresident() {
            if(president==null)
                president = new OurPresident();
            return president;
        }
    }

    /*
    public static class OurPresident {

      static {

             synchronized (Solution.class){

                 president = new OurPresident();
             }
      }

        private static OurPresident president;

        private OurPresident() {
        }

        public static OurPresident getOurPresident() {
            return president;
        }
    }
     */

    public static void main(String[] args){
        System.out.println(OurPresident.getOurPresident());
    }
}
