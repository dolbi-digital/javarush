package com.javarush.test.level17.lesson10.bonus01;

/* CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion
!!!РЕКОМЕНДУЕТСЯ выполнить level17.lesson10.bonus01 перед этой задачей!!!

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с  - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u  - обновляет соответствующие данные людей с заданными id
-d  - производит логическое удаление всех людей с заданными id
-i  - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople
Порядок вывода данных соответствует вводу данных
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных)
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat
*/
/*
public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Person person = null;

        // CREATE ==================================================================================================================
        // -c name1 sex1 bd1 name2 sex2 bd2 ...

        if(args[0].equals("-c")){
            synchronized (Solution.class){
                for(int i = 1; i < args.length; i+=3){

                    if(args[i+1].equals("м")){
                        person = Person.createMale(args[i], format.parse(args[i+2]));
                    }
                    else if(args[i+1].equals("ж")){
                        person = Person.createFemale(args[i], format.parse(args[i+2]));
                    }

                    allPeople.add(person);
                    System.out.println(allPeople.indexOf(person));
                }
            }
        }

        // UPDATE ==================================================================================================================
        // -u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...

        else if(args[0].equals("-u")){
            synchronized (Solution.class){
                for(int i = 1; i < args.length; i+=4){
                    int id = Integer.parseInt(args[i]);
                    allPeople.get(id).setName(args[i+1]);
                    if(args[i+2].equals("м")){
                        allPeople.get(id).setSex(com.javarush.test.level17.lesson10.bonus02.Sex.MALE);
                    }
                    else if(args[i+2].equals("ж")){
                        allPeople.get(id).setSex(com.javarush.test.level17.lesson10.bonus02.Sex.FEMALE);
                    }
                    allPeople.get(id).setBirthDay(format.parse(args[i+3]));
                }
            }
        }

        // DELETE ==================================================================================================================

        else if(args[0].equals("-d")){
            synchronized (Solution.class){
                for(int i = 1; i < args.length; i++)
                {
                    int id = Integer.parseInt(args[i]);
                    allPeople.get(id).setName(null);
                    allPeople.get(id).setSex(null);
                    allPeople.get(id).setBirthDay(null);
                }
            }
        }

        // INFO ====================================================================================================================
        // -i id1 id2 id3 id4 ...

        else if(args[0].equals("-i")){
            synchronized (Solution.class){
                for(int i = 1; i < args.length; i++){
                    int id = Integer.parseInt(args[i]);
                    person = allPeople.get(id);
                    String name = person.getName();
                    String sex = "";

                    if(person.getSex().equals(com.javarush.test.level17.lesson10.bonus02.Sex.MALE)){
                        sex = "м";
                    }
                    else if(person.getSex().equals(Sex.FEMALE)){
                        sex = "ж";
                    }

                    SimpleDateFormat formatInfo = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                    String date = formatInfo.format(person.getBirthDay());
                    System.out.println(name + " " + sex + " " + date);
                }
            }
        }

        // PRINT PERSONS ==========================================================================================================

        System.out.println("====================");
        for(Person pers : allPeople){
            try{
                System.out.println(pers.getName() + " " + pers.getSex() + " " + format.format(pers.getBirthDay()));
            }
            catch (NullPointerException e){
                System.out.println(pers.getName() + " " + pers.getSex());
            }
        }
    }
}
*/
