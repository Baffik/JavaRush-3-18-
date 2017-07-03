package com.javarush.test.level10.lesson11.home08;



/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        String s = "mama";
        String s1 =  "Ramu";
        String s2 = "mula";
        ArrayList<String>[] list  = new ArrayList[3];

        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList<String>();

        for (int i=0; i<2; i++)
        {//напишите тут ваш код
            list1.add(s);
            list2.add(s1);
            list3.add (s2);
        }
        list[0] =list1;
        list[1] =list2;
        list[2] =list3;

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}