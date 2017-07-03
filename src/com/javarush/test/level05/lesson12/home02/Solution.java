package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man Nikita = new Man ("Nikita", "val", 20);
        Man Niks = new Man ("noks","moks", 31);

        Woman Svet = new Woman ("Svet","mila", 18);
        Woman masha = new Woman ("kuks","muks",31);//создай по два объекта каждого класса тут

        System.out.println (Nikita);
        System.out.println (Niks);
        System.out.println (Svet);
        System.out.println (masha);//выведи их на экран тут
    }

    public static class Man
    {
        int age;
        String address,name;
       public Man (String name, String address, int age)
       {
           this.name = name;
           this.address = address;
           this.age = age;
       }
    }//добавьте тут ваши классы

    public static class Woman
    {
        int age;
        String address,name;
       public Woman (String name, String address, int age)
       {
           this.name = name;
           this.address = address;
           this.age = age;
       }
    }
}
