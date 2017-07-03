package com.javarush.test.level18.lesson03.task01;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader c = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream in = new FileInputStream(c.readLine());

        int max=0;

        while(in.available() >0)
        {
          int bit = in.read();


            if( bit>max)
            {
               max=bit;
            }
        }

        System.out.println(max);

        c.close();
        in.close();
    }
}
