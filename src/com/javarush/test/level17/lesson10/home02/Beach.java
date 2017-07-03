package com.javarush.test.level17.lesson10.home02;

/* Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach, который будет использоваться нитями.
*/


public class Beach implements Comparable<Beach>  {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }


    @Override
    public int compareTo(Beach o) {

      if (o.distance>distance && o.quality>quality)
      {
         return 1;
      }
      else if (o.distance == distance && o.quality==o.quality)
      {
          return 0;
      }

      else

          return -1;


    }


  //  public static void main(String[] args){

//        Beach b2 = new Beach( "Mass2", 125.5f, 6);
 //       Beach b1 = new Beach( "Mass", 123.5f, 5);


  //     System.out.println (b1.compareTo(b2));


  //  }
}
