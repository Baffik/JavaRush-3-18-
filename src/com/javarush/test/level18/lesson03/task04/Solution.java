package com.javarush.test.level18.lesson03.task04;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader c = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream in = new FileInputStream(c.readLine());


        ArrayList<Integer> list1 = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();


        while (in.available() > 0)
        {

            Integer bite = in.read();

            list1.add(bite);
        }



        for (int i = 0; i < list1.size(); i++) {

            int count = 0;
            Integer bu = list1.get(i);

            for (int y = 0; y < list1.size(); y++)
            {
                if (bu == list1.get(y))
                {
                    count++;
                }
            }
            map.put(bu, count);

        }


        Integer z=10000;

        for (Map.Entry<Integer, Integer> pair : map.entrySet())
        {

            Integer value = pair.getValue();

            if (value<z)
            {
                z=value;
            }
        }

        for (Map.Entry<Integer, Integer> pair : map.entrySet())
        {
            Integer key = pair.getKey();
            Integer value = pair.getValue();

            if(value<=z)
            {
                System.out.print (key+" ");
            }
        }

        c.close();
        in.close();
    }
}
