package com.javarush.test.level05.lesson12.home01;

/* Три класса
По аналогии с классом Duck(утка) создай классы Cat(кошка) и Dog(собака).
Подумай, что должен возвращать метод toString в классах Cat и Dog?
В методе main создай по два объекта каждого класса и выведи их на экран.
Объекты класса Duck уже созданы и выводятся на экран.
*/

public class Solution
{

    public static void main(String[] args)
    {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        Cat maks = new Cat();
        Cat tolya = new Cat();
        System.out.println(maks);
        System.out.println(tolya);

        Dog Sharik = new Dog();
        Dog Shtirlic = new Dog();
        System.out.println(Sharik);
        System.out.println(Shtirlic);

    }

    public static class Duck
    {
        public String toString()
        {
            return "Duck";
        }
    }

    public static class Cat
    {
        public String toString()
        {
            return "Cat";
        }
    }

    public static class Dog
    {
        public String toString()
        {
            return "Dog";
        }
    }
}
