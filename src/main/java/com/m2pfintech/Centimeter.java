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
        return this.magnitude;
    }

    @Override
    public boolean equals(Object object)
    {
      Centimeter unit = (Centimeter) object;
      if(this.magnitude == unit.getMagnitude())
          return true;
      return false;
    }
}
