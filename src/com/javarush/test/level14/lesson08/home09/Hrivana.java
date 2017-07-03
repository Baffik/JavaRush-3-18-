package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Nika on 05.11.2016.
 */
public class Hrivana extends Money
{
    public Hrivana(double amount)
    {
        super(amount);
    }
    public String getCurrencyName()
    {
        return "HRN";
    }
}
