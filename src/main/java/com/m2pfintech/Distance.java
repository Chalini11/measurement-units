package com.m2pfintech;

public class Distance
{
    private static class Unit
    {
        static final Unit cm = new Unit(0.01);
        static final Unit m = new Unit(1);
        static final Unit km = new Unit(1000);
        private final double baseFactor;
        private Unit(double baseFactor) {
            this.baseFactor = baseFactor;
        }
    }

    private final double magnitude;
    private final Unit unit;
    public Distance(double magnitude, Unit unit)
    {
        this.magnitude = magnitude;
        this.unit = unit;
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

      Distance u = (Distance) object;
      return (convertToBaseUnit() == u.convertToBaseUnit());


      // that how is it working ...-> its private right.
    }

    public double convertToBaseUnit()
    {
        return magnitude * (unit.baseFactor);
    }

    public static Distance Kilometer(double magnitude)
    {
        return new Distance(magnitude,Unit.km);
    }
    public static Distance Meter(double magnitude)
    {

        return new Distance(magnitude,Unit.m);
    }

    public static Distance Centimeter(double magnitude)
    {
        return new Distance(magnitude,Unit.cm);
    }

    public Distance distanceAdd(Distance distanceToBeAdded)
    {
        return new Distance(magnitude+this.convertToUnit(distanceToBeAdded),unit);
    }
    public double convertToUnit(Distance obj)
    {
        double value = obj.convertToBaseUnit();
        value = value * unit.baseFactor;
        return (value);
    }





}

