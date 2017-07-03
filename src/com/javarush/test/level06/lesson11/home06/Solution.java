package com.javarush.test.level06.lesson11.home06;

/* KissMyShinyMetalAss
Создай класс с именем KissMyShinyMetalAss. Создай объект этого класса, выведи его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        KissMyShinyMetalAss kiss = new KissMyShinyMetalAss("vaska", 21);
        System.out.println(kiss);
    }

    public static class KissMyShinyMetalAss
    {

        String name;
        int age;

       public   KissMyShinyMetalAss (String name,int age)
       {
           this.name = name;
           this.age = age;
       }


    }

}
