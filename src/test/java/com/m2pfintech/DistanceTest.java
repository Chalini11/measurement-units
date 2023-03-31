package com.m2pfintech;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.m2pfintech.Distance.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

public class DistanceTest
{
    //
    private static Distance oneDistance;
    private static Distance oneMeter;

    @BeforeAll
    static void setup()
    {
        oneDistance = Centimeter(1);
        oneMeter = Meter(1);
    }

    @Test

    void toReturnTrueIfOneCentimeterIsOneCentimeter()
    {

        Distance anotherOneDistance = Centimeter(1);

        assertThat(oneDistance,is(equalTo(anotherOneDistance)));
    }
    @Test
    void toReturnTrueIfOneCentimeterIsNotTneCentimeter()
    {

        Distance anotherOneDistance = Centimeter(2);

        assertThat(oneDistance,is(not(equalTo(anotherOneDistance))));
    }

    @Test
    void toReturnTrueWhenHundredCentimeterIsOneMeter()
    {

        Distance hundredCentimeters = Centimeter(100);
        Distance oneMeter = Meter(1);
        assertThat(oneMeter, is(equalTo(hundredCentimeters)));
    }


    @Test
    void toReturnTrueWhenHundredCentimeterIsOnePointFiveKilometer()
    {
        Distance hundredDistance = Centimeter(100);
        Distance kilometer = Kilometer(0.1);

        assertThat(kilometer,is(not(equalTo(hundredDistance))));
    }

    @Test
    void toReturnTwoMeterWhenHundredCentiMeterIsAddedToOneMeter()
    {
        Distance oneMeter = Meter(1);
        Distance hundredCentimeter = Centimeter(100);
        Distance twoMeter = Meter(2);


        assertThat(twoMeter,is(equalTo(oneMeter.distanceAdd(hundredCentimeter))));



    }
}
