package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream in = new FileInputStream("D:\\Java\\java failu\\1.txt");
        //FileInputStream in = new FileInputStream (args[0]);

        byte[] massiv = new byte[in.available()];
        in.read(massiv);

        Map<Character, Integer> maps = new HashMap<Character, Integer>();

        Arrays.sort(massiv);
        int count = 0;

        for (byte x : massiv) {
            count=0;

            for (byte x1 : massiv)
            {
                if (x==x1)
                {
                    count++;
                }
            }

            maps.put((char)x,count);
        }

        for (Map.Entry<Character, Integer> pair : maps.entrySet())
        {
           Character key = pair.getKey();
            Integer value = pair.getValue();

            System.out.println (key+" "+value);

        }

    }

}
