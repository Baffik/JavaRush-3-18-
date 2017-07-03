package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Nika on 14.11.2016.
 */
public class Singleton {

    private final static Singleton obyect = new Singleton ();

    private Singleton() {}

      public Singleton getInstance ()
        {
           return obyect;
        }
}
