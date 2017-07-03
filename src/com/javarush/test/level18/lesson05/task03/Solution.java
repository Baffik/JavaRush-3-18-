package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
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
        FileOutputStream out1 = new FileOutputStream(c.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();

        while(in.available()>0)
        {int count = in.read();list.add(count);}

        int raz = list.size();

        if(raz%2==0) {for (int i = 0; i < list.size()/2; i++) {out.write (list.get(i));}
        for (int i = list.size()/2 ; i < list.size(); i++) {out1.write (list.get(i));}}

        if(!(raz%2==0))
        {
            for (int i = 0; i < list.size()/2+1; i++)
            {
                out.write (list.get(i));
            }

            for (int i = list.size()/2+1 ; i < list.size(); i++)
            {
                out1.write (list.get(i));
            }
        }


        out.close();
        out1.close();
        in.close();
        c.close();
    }
}
