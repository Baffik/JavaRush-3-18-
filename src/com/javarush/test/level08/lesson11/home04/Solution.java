package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Short.MAX_VALUE;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = MAX_VALUE;
        for (int i =0; i<array.size(); i++)
        {
           if (array.get(i)<min)
           {
               min = array.get(i);
           }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {

        BufferedReader c = new BufferedReader (new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<Integer>();
        int N = Integer.parseInt(c.readLine());
        for (int i=0; i<N; i++)
        {
            int b = Integer.parseInt(c.readLine());
            list.add(b);
        }//Тут создать и заполнить список
        return list;
    }
}
