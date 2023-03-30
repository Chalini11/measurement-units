package com.m2pfintech;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class MeasurementTest
{
    //
    Centimeter oneCentimeter = new Centimeter(1);
    Centimeter anotherOneCentimeter = new Centimeter(1);
    @Test

    void toReturnTrueIfOneCentimeterIsOneCentimeter()
    {

        assertThat(oneCentimeter,is(equalTo(anotherOneCentimeter)));
    }
}
