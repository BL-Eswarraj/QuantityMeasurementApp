package test;

import main.QuantityMeasurementApp;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class QuantityMeasurementAppTest {

    private QuantityMeasurementApp.Feet feet1;
    private QuantityMeasurementApp.Feet feet2;
    private QuantityMeasurementApp.Feet feet3;

    @Before
    public void setUp() {
        feet1 = new QuantityMeasurementApp.Feet(1.0);
        feet2 = new QuantityMeasurementApp.Feet(1.0);
        feet3 = new QuantityMeasurementApp.Feet(2.0);
    }

    @Test
    public void testEquality_SameValue() {
        assertTrue("1.0 ft should equal 1.0 ft", feet1.equals(feet2));
    }

    @Test
    public void testEquality_DifferentValue() {
        assertFalse("1.0 ft should NOT equal 2.0 ft", feet1.equals(feet3));
    }

    @Test
    public void testEquality_NullComparison() {
        assertFalse("Feet should NOT equal null", feet1.equals(null));
    }

    @Test
    public void testEquality_SameReference() {
        assertTrue("Feet should equal itself", feet1.equals(feet1));
    }

    @Test
    public void testEquality_DifferentTypeComparison() {
        String notFeet = "1.0 ft";
        assertFalse("Feet should NOT equal String", feet1.equals(notFeet));
    }
}