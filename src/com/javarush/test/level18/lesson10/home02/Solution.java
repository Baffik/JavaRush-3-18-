package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader c = new BufferedReader(new InputStreamReader(System.in));

        String s = c.readLine();
        int allSimvol = 0;
        int probel = 0;

        FileInputStream in = new FileInputStream(s);

        while (in.available()>0)
        {
            int simvol = in.read();
            allSimvol++;

            if (simvol==32)
            {
                probel++;
            }
        }

        double otn = ((double)probel/allSimvol)*100;

        System.out.println(String.format("%.2f", otn));
      //  System.out.println(probel);
       // System.out.println(allSimvol);

        c.close();
        in.close();


    }
}
