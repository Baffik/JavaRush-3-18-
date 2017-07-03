package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.Iterator;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader c = new BufferedReader(new InputStreamReader(System.in));
        String s;
        TreeSet<String> set = new TreeSet<>();
        FileOutputStream out = null;
        while (true) {
            s = c.readLine();
            if (s.equals("end")) {
                break;
            }
            set.add(s);
        }

        String currentFileName = "";
        String nextName;
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            nextName = iterator.next();
            if (currentFileName.equals("")) {
                currentFileName = nextName.substring(0, nextName.lastIndexOf('.'));
            }
            out = new FileOutputStream(currentFileName);
            FileInputStream in = new FileInputStream(nextName);
            byte[] buffer = new byte[in.available()];
            while (in.available() > 0) {
                int bute = in.read(buffer);
                out.write(buffer, 0, bute);
            }

        }
    }
}
