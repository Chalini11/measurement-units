package com.m2pfintech;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class MeasurementTest
{
    Measurement measurementObject1cm1cm = new Measurement(1,1);

    @Test

    void toReturnTrueIfOneCentimeterIsOneCentimeter()
    {

        boolean actualValue = measurementObject1cm1cm.checkCentimeterCentimeter();

        assertThat(actualValue,is(equalTo(true)));
    }
}
