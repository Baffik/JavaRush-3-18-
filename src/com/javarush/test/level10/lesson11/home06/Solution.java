package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        int age;
        int rost;
        int ves;
        int bicak;
        String fam;

        Human(String name,int age,int rost,int ves,int bicak,String fam)
        {
            this.name = name;
            this.age = age;
            this.rost = rost;
            this.ves = ves;
            this.bicak = bicak;
            this.fam =fam;
        }
        Human(int age,int rost,int ves,int bicak,String fam)
        {
            this.age = age;
            this.rost = rost;
            this.ves = ves;
            this.bicak = bicak;
            this.fam =fam;
        }
        Human(int rost,int ves,int bicak,String fam)
        {
            this.rost = rost;
            this.ves = ves;
            this.bicak = bicak;
            this.fam =fam;
        }
        Human(int ves,int bicak,String fam)
        {
            this.ves = ves;
            this.bicak = bicak;
            this.fam =fam;
        }
        Human(int bicak,String fam)
        {
            this.bicak = bicak;
            this.fam =fam;
        }
        Human(String fam)
        {
            this.fam =fam;
        }
        Human(String name,int age,int rost,int ves,String fam)
        {
            this.name = name;
            this.age = age;
            this.rost = rost;
            this.ves = ves;
            this.fam =fam;
        }
        Human(String name,int age,int bicak,String fam)
        {
            this.name = name;
            this.age = age;
            this.bicak = bicak;
            this.fam =fam;
        }
        Human(String name,int bicak,String fam)
        {
            this.name = name;
            this.bicak = bicak;
            this.fam =fam;
        }
        Human(int age,String fam,String name)
        {
            this.name = name;
            this.age = age;
            this.fam =fam;
        }

    }
}
