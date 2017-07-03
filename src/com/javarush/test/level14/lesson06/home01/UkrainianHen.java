package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Nika on 03.11.2016.
 */
public class UkrainianHen extends Hen implements Country
{
    int n=25;
    int getCountOfEggsPerMonth()
    {
        return n;
    }
    public String getDescription()
    {
        return super.getDescription() +" Моя страна - "+ UKRAINE +". Я несу "+ n + "яиц в месяц";
    }
}