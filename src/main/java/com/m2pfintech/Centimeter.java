package com.m2pfintech;

public class Centimeter
{
    private final double magnitude;

    public Centimeter(double magnitude)
    {
        this.magnitude = magnitude;
    }

    public double getMagnitude()
    {
        return magnitude;
    }

    @Override
    public boolean equals(Object object)
    {

      if(this == object)
          return true;
      if(object.getClass() != this.getClass())
            return false;

      Centimeter unit = (Centimeter) object;
      if(magnitude == unit.getMagnitude())
          return true;
      return false;

      // that how is it working ...-> its private right.
    }
    public static Centimeter Kilometer(double kilometer)
    {
        return new Centimeter((kilometer*100000));
    }
    public static Centimeter Meter(double meter)
    {
        return new Centimeter((meter*100));
    }

//    public double convertToKilometer()
//    {
//        return magnitude/100000;
//    }
//
//    public double convertToMeter()
//    {
//        return magnitude/100;
//    }



}

