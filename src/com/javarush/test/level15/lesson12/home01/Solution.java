package com.javarush.test.level15.lesson12.home01;


/* Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader c = new BufferedReader(new InputStreamReader(System.in));

        while(true)
        {
            String s = c.readLine();
            if(s.equals("exit")) break;

            try {
                int g = Integer.parseInt(s);
                if (g > 0 && g < 128) {
                    print((short) g);
                }
                else if (g >= 128)
                {
                    print(g);
                }

                char[] ch = s.toCharArray();

                for (int i = 0; i < ch.length; i++) {

                    if (ch[i] == '.')

                    {
                        print(Double.parseDouble(s));
                    }
                }



            }

            catch (Exception e)
    {
             print(s);
    }

        }//напиште тут ваш код
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
