package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nika on 28.06.2017.
 */
public class Hippodrome {

  private  List<Horse> horses;
    static Hippodrome game;

  public List<Horse> getHorses ()
  {
      return horses;
  }


  public Hippodrome (List<Horse> horses)
  {
    this.horses = horses;
  }

    public static void main(String[] args) {
      Horse h1 =  new Horse("Pobeda",3.0, 0.0);
      Horse h2 =  new Horse("Ivanka",3.0, 0.0);
      Horse h3 =  new Horse("Luch",3.0, 0.0);
      List<Horse> horses = new ArrayList<Horse>();
      horses.add(h1);
      horses.add(h2);
      horses.add(h3);
      game = new Hippodrome(horses);
       // game.getHorses().add(h1);
      //  game.getHorses().add(h2);
       // game.getHorses().add(h3);
        game.run();
        game.printWinner();
    }

    public void run()
    {
        try {
            for (int i = 1; i <= 100; i++) {
                move();
                print();

                Thread.sleep(200);
            }
        }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }


    }

    public void move()
    {
        for( int i=0; i<getHorses().size(); i++)
        {
           horses.get(i).move();
        }
    }


    public void print() {
        for (int i = 0; i < getHorses().size(); i++) {
            horses.get(i).print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

        public Horse getWinner()
    {
        Horse name=null;
        double dist =0;

            for(int i=0; i<getHorses().size(); i++)
            {
                if (horses.get(i).getDistance() > dist)
                {
                    dist = horses.get(i).getDistance();
                    name = horses.get(i);
                }
            }
       return name;
    }

public void printWinner()
{
    System.out.println("Winner is "+ getWinner().getName()+"!");
}

}
