package com.javarush.test.level15.lesson04.task02;

/* ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.
*/

public class Solution {
    public static void main(String[] args)
    {
        printMatrix(2, 3, "8");
        printMatrix((Integer)2, 3, "8");
        printMatrix((Integer)2,(Integer) 3, "8");
        printMatrix((Integer)2, (short)3, "8");
        printMatrix(2, (short) 3, "8");

        printMatrix((Integer)2, 3, (short)8);
        printMatrix((Integer) 2,  3, 8);
        printMatrix((Double) 2.0,  3, (String)"8");

    }

    public static void printMatrix(int m, int n, String value)
    {
        System.out.println("Заполняем объектами String");
        printMatrix((Integer)m, n, (Object) value);

    }

    public static void printMatrix(int m, String n, String value)
    {
        System.out.println("Заполняем объектами String");
        printMatrix((Integer)m, (String) n, (String) value);

    }

    public static void printMatrix(int m, int n, Object value)
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(Integer m, int n, Object value)
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(Integer m, Integer n, Object value)
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(Integer m, short n, Object value)
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(short m, int n, Object value)
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(Integer m, int n, short value)
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(Integer m, int n, int value)
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(Double m, int n, String value)
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    }

