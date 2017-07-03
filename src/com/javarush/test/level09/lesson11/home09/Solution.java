package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<String> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map <String,Cat>  map = new HashMap<String,Cat>();
        Cat cat1 = new Cat("кот1");
        Cat cat2 = new Cat("кот2");
        Cat cat3 = new Cat("кот3");
        Cat cat4 = new Cat("кот4");
        Cat cat5 = new Cat("кот5");
        Cat cat6 = new Cat("кот6");
        Cat cat7 = new Cat("кот7");
        Cat cat8 = new Cat("кот8");
        Cat cat9 = new Cat("кот9");
        Cat cat10 = new Cat("кот10");

        map.put("1",cat1);
        map.put("2",cat2);
        map.put("3",cat3);
        map.put("3",cat4);
        map.put("5",cat5);
        map.put("6",cat1);
        map.put("7",cat1);
        map.put("8",cat1);
        map.put("9",cat1);
        map.put("10",cat1);

        return (HashMap) map;
    }

    public static Set<String> convertMapToSet(Map<String, Cat> map)
    {
       Set <String>  ma = new HashSet<String>();
        for (Map.Entry<String, Cat> b : map.entrySet())
        {
            String key = b.getKey();
            ma.add(key);
        }
        return (HashSet) ma;//напишите тут ваш код
    }

    public static void printCatSet(Set<String> set)
    {
        for (String cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
