package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;
import java.util.List;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        int[] a =  {1,2,3,4,5};
        int[] a1 = {1,2};
        int[] a2 = {1,2,3,4};
        int[] a3 = {1,2,3,4,5,6,7};
        int[] a4 =new int[0];
        List<int[]> list = new ArrayList<int[]>();

        list.add(a);
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);

        return (ArrayList) list;

    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
