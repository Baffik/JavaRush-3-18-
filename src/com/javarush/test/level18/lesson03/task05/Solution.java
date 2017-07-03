package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

        public class Solution {
            public static void main(String[] args) throws Exception {

                BufferedReader c = new BufferedReader(new InputStreamReader(System.in));

                FileInputStream in = new FileInputStream(c.readLine());

                ArrayList <Integer> list = new ArrayList<>();


                while(in.available()>0)
                {
                    int read = in.read();

                    list.add(read);
                }

                for (int i = list.size() - 1; i > 0; i--)
                {
                    for (int j = 0; j < i; j++)
                    {
                        if (list.get(j) > list.get(j + 1))
                        {
                            int tmp = list.get(j);
                            list.set(j, list.get(j + 1));
                            list.set(j + 1, tmp);
                        }
                    }
                }
                int count=0;
                for(int i=0; i<list.size();i++)
                {
                    Integer g = list.get(i);
                    for(int y=0; y<list.size();y++)
                    {
                        if (g.equals(list.get(y)))
                        {
                            count++;
                            if(count == 2)
                            {
                                --count;
                                list.remove(y);
                            }
                        }
                    }
                }


                for(Integer x: list)
                {
                    System.out.print(x+"  ");
                }

                c.close();
                in.close();
            }
        }
