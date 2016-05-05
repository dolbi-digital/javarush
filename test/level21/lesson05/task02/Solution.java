package com.javarush.test.level21.lesson05.task02;

import java.util.HashSet;
import java.util.Set;

/* Исправить ошибку
Сравнение объектов Solution не работает должным образом. Найти ошибку и исправить.
Метод main не участвует в тестировании.
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if(o == this){
            return true;
        }
        if(o == null || o.getClass() != this.getClass()){
            return false;
        }
        Solution guest = (Solution) o;
        return (this.first == guest.first || (this.first != null && this.first.equals(guest.first))) &&
                (this.last == guest.last || (this.last != null && this.last.equals(guest.last)));
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((first == null) ? 0 : first.hashCode());
        result = prime * result;
        result = prime * result + ((last == null) ? 0 : last.hashCode());
        return result;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}
