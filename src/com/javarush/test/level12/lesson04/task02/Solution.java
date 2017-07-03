package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
    print((Integer)2);
       print (2);

    }

    public static int print (int i)
    {
      i = 5;
        return i;
    }
    public static Integer print (Integer integ)
    {
        integ = 10;
        return integ;
    }
}
