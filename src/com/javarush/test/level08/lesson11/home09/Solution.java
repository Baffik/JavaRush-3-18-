package com.javarush.test.level08.lesson11.home09;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader c = new BufferedReader((new InputStreamReader(System.in)));
        String s = c.readLine();
        boolean b =isDateOdd(s);
        System.out.println (s +" = "+b);
    }

    public static boolean isDateOdd(String date)
    {
        Date b = new Date(date);
        int m = b.getDate();

        if (m%2 ==0)
        {
            return true;
        }
        else return false;
    }
}
