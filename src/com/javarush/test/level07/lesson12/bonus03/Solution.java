package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);


        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array)
    {

        for (int i = 0; i<array.length; i++)
        {
            int max = array[i];
            int ma = i;
            for (int j = i + 1; j < array.length; j++)
            {
                if (max < array[j])
                {
                    max = array[j];
                    ma = j;
                }
            }

            if (i != ma)
            {
                int t = array[i];
                array[i] = array[ma];
                array[ma] = t;
            }
        }//напишите тут ваш код
    }
}
