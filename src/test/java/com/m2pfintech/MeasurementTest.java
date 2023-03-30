package com.m2pfintech;

import org.junit.jupiter.api.Test;

import static com.m2pfintech.Centimeter.Kilometer;
import static com.m2pfintech.Centimeter.Meter;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

public class MeasurementTest
{
    //
    Centimeter oneCentimeter = new Centimeter(1);
    Centimeter oneMeter = Meter(1);


    @Test

    void toReturnTrueIfOneCentimeterIsOneCentimeter()
    {

        Centimeter anotherOneCentimeter = new Centimeter(1);

        assertThat(oneCentimeter,is(equalTo(anotherOneCentimeter)));
    }
    @Test
    void toReturnTrueIfOneCentimeterIsNotTneCentimeter()
    {

        Centimeter anotherOneCentimeter = new Centimeter(2);

        assertThat(oneCentimeter,is(not(equalTo(anotherOneCentimeter))));
    }

    @Test
    void toReturnTrueWhenHundredCentimeterIsOneMeter()
    {
        Centimeter hundredCentimeter = new Centimeter(100);

        assertThat(oneMeter,is(equalTo(hundredCentimeter)));
    }


    @Test
    void toReturnTrueWhenHundredCentimeterIsOnePointFiveKilometer()
    {
        Centimeter hundredCentimeter = new Centimeter(100);
        Centimeter kilometer = Kilometer(0.1);

        assertThat(kilometer,is(not(equalTo(hundredCentimeter))));
    }
}
