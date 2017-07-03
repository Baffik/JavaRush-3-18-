package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader c = new BufferedReader(new InputStreamReader(System.in));
        String s = c.readLine();

        List<Character> list = new ArrayList<Character>();
        List<Character> list2 = new ArrayList <Character>();
        char[] ch = s.toCharArray();

        for (int i=0; i< ch.length ;i++)
        {
            boolean h = isVowel(ch[i]);

            if (h == true)
            {
                list.add(ch[i]);
            } else if (h == false)
            {
                list2.add(ch[i]);
            }
        }
            for (Character t: list)
            {
                System.out.print (t+" ");
            }

            System.out.println (" ");

            for (Character a: list2)
            {
                System.out.print (a+" ");
            }
        //напишите тут ваш код
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
