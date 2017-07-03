package com.javarush.test.level09.lesson11.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {

        BufferedReader c = new BufferedReader (new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        try
        {
            while(true)
            {
                int b = Integer.parseInt(c.readLine());
                list.add(b);
            }
        }
        catch (Exception e)
        {
            for (Integer a: list)
            {
                System.out.println (a);
            }
        }//напишите тут ваш код
    }
}
