package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader c = new BufferedReader(new InputStreamReader(System.in));

          String s= c.readLine();
        int Summa=0;

        while (!(s.equals("сумма")))
        {
          int a = Integer.parseInt(s);
            Summa = Summa + a;

            s = c.readLine();
        }
        System.out.println (Summa);
    }
}
