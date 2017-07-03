package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader c = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream in = new FileInputStream(c.readLine());

        FileOutputStream out = new FileOutputStream(c.readLine());

        ArrayList<Integer> list = new ArrayList<Integer>();

        while(in.available()>0)
        {
            int g = in.read();
            list.add(g);
        }

        for(int i=list.size()-1; i>=0; i--)
        {
            out.write(list.get(i));
        }

        in.close();
        c.close();
        out.close();
    }
}
