package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

for (int i = 0; i<N; i++ )
{
    String s = reader.readLine();
    list.add (s);
}
  for (int i = 0; i<M; M--)
  {
      String h = list.get(i);
      list.add (h);
      list.remove(i);
  }

  for (int i = 0; i<list.size(); i++)
  {
      System.out.println (list.get(i));
  }

    }
}
