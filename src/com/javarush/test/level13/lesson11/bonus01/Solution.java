package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader c = new BufferedReader (new InputStreamReader(System.in));
        String s = c.readLine();

       BufferedReader inn = new BufferedReader(new InputStreamReader(new FileInputStream(s)));

        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list1 = new ArrayList<Integer>();

        while(inn.ready())
        {
           int g  = Integer.parseInt (inn.readLine());
            list.add (g);

        }

        for (int i=0; i<list.size(); i++)
        {
         if(list.get(i)%2 ==0)
         {
             list1.add(list.get(i));
         }
        }

        Collections.sort( list1);

        for(int g: list1)
        {
            System.out.println(g);
        }
      c.close();
      inn.close();
    }
}
