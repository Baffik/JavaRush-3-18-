package com.javarush.test.level18.lesson10.home08;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
try {
    BufferedReader c = new BufferedReader(new InputStreamReader(System.in));
    String name = c.readLine();
    System.out.println(name);

    while (!(name.equals("exit")))
    {
        ReadThread RD = new ReadThread(name);
        RD.start();
        RD.join();
        name = c.readLine();

    }

    for (Map.Entry<String, Integer>pair:resultMap.entrySet())
    {
        System.out.println(pair.getKey()+" "+pair.getValue());
    }
c.close();
}
catch (Exception e)
{
    e.printStackTrace();
}

    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
        }
            public void run()
            {
          try {
              FileInputStream in = new FileInputStream(fileName);
              ArrayList<Integer> list = new ArrayList<>();
            int maksbait = 0;
              while (in.available()>0)
              {
                int bait = in.read();
                list.add(bait);
              }


              for( int i=0; i<list.size(); i++)
              {
                  int a = list.get(i);
                  int summ =0;

                  for (int j=0; j<list.size(); j++)
                  {
                    int b = list.get(j);

                    if(a==b)
                    {
                        summ++;
                    }
                  }

                  if (maksbait<summ)
                  {
                      maksbait = summ;
                  }
              }

              resultMap.put(fileName, maksbait);


             in.close();
          }
          catch (Exception e)
          {
              e.printStackTrace();
          }
           //implement constructor body
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
