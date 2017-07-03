package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader c = new BufferedReader(new InputStreamReader(System.in));

        String Ffail = c.readLine();
        String Sfail = c.readLine();


        FileInputStream inF = new FileInputStream(Ffail);
        FileInputStream inF2 = new FileInputStream(Sfail);


        byte[] buffer = new byte[inF.available()];
        byte[] buffer2 = new byte[inF2.available()];

        inF.read(buffer);
        inF2.read(buffer2);

        FileOutputStream out = new FileOutputStream(Ffail, false);
        out.write(buffer2);
        out.write(buffer);
    }



    }

