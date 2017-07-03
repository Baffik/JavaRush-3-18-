package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Nika on 03.11.2016.
 */
public  class RussianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 3;
    }
    String getDescription()
    {
        return super.getDescription()+" Моя страна - "+Country.RUSSIA+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
