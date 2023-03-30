package com.m2pfintech;

public class Measurement
{

    int firstValue;
    int secondValue;

    Measurement(int firstValue, int secondValue)
    {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    boolean checkCentimeterCentimeter()
    {
        if( firstValue == secondValue)
            return true;
        return false;
    }
}
