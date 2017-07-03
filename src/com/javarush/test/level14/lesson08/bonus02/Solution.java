package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader c = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(c.readLine());
        int b = Integer.parseInt(c.readLine());

        int min = 0;


        if(a<b)
            min=b;
        else min=a;
        int chuslo=0;

        for(int i=1; i<=min; i++)
        {
            if( a%i == 0 && b%i == 0)
            {
               chuslo=i;
            }
        }

        c.close();

        System.out.println(chuslo);
    }
}
