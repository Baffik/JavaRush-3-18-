package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать
 в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/


import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader c = new BufferedReader(new InputStreamReader(System.in));

        String Wfail = c.readLine();
        String Ffail = c.readLine();
        String Sfail = c.readLine();


        FileInputStream inF = new FileInputStream(Ffail);
        FileOutputStream out = new FileOutputStream(Wfail);

        while (inF.available()>0)
        {
            int read = inF.read();
            out.write(read);
        }

        inF.close();

        FileInputStream inS = new FileInputStream(Sfail);

        while(inS.available()>0)
        {
            int read = inS.read();
            out.write(read);
        }

        inS.close();
        out.close();


    }
}
