package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

        BufferedReader c= new BufferedReader(new InputStreamReader(System.in));

        try {
            String s = c.readLine();
            FileInputStream inf = new FileInputStream(s);
            int count = 0;

            while (inf.available()>0)
            {
                int data = inf.read();

                if (data>96 && data <123) //a-z Asci kod
                {
                    count ++;
                }
                else if (data>64 && data <91) //A_Z Asci kod
                {
                    count ++;
                }

                else continue;

            }

            System.out.println (count);
            c.close();
            inf.close();

        }
        catch (Exception e)
        {}

    }
}
