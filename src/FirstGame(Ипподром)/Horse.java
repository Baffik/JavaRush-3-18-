package com.javarush.task.task21.task2113;

/**
 * Created by Nika on 28.06.2017.
 */
public class Horse {

    String name;
    double speed;
    double distance;

    public Horse (String name, double speed, double distance)
    {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName() {return this.name;}

    public double getDistance() {
        return distance;
    }

    public double getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }


    public void move()
    {
       // speed *= Math.random();
        this.distance += this.speed*Math.random();
    }

    public void print()
    {
        int c = (int) distance;
        String s ="";
        for(int i=0; i<c; i++)
        {
            s = s+(".");
        }
        System.out.println(s+name);
    }
}
