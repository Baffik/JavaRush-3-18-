package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader c = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(c.readLine());
        int count=0;

        while (in.available() >0)

        {
            int red = in.read();

            if( red==44)
            {
              count++;
            }

        }
        System.out.println(count);
        in.close();
        c.close();




    }
}
