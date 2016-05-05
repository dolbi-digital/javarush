package com.javarush.test.level21.lesson08.task01;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* Глубокое клонирование карты
Клонируйтие объект класса Solution используя глубокое клонирование.
Данные в карте users также должны клонироваться.
Метод main изменять нельзя.
*/
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = (Solution) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User{
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    @Override
    public Solution clone() throws CloneNotSupportedException {
        Solution cloned = new Solution();
        Iterator<Map.Entry<String, User>> iterator = users.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, User> pair = iterator.next();
            String string = pair.getKey();
            User user = pair.getValue();
            cloned.users.put(string, new User(user.age, user.name));
        }
        return cloned;
    }
}
