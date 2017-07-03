package com.javarush.test.level10.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка – конец ввода данных. Числа могу повторяться. Строки всегда уникальны. Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мыла
2 Рама
1 Мама
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       HashMap<String,Integer> map =new HashMap<String,Integer>();
        while(true)
        {
            String i = reader.readLine();
            if(i.isEmpty()) break;
           int  id = Integer.parseInt(i);
            String name = reader.readLine();
            if(name.isEmpty()) break;
            map.put(name,id);
        }
      for(Map.Entry<String,Integer> b: map.entrySet())
      {
        String key = b.getKey();
          Integer value = b.getValue();

          System.out.println (value +" "+key);
      }


    }
}