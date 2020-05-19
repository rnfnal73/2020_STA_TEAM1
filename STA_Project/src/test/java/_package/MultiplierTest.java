package _package;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplierTest {

    @Test
    public void multiply() {
        Multiplier multiplier = new Multiplier();
        assertEquals(72,multiplier.Multiply(8,9));
    }

    @Test
    public void multiply1() {
        Multiplier multiplier = new Multiplier();
        assertEquals(multiplier.Multiply(2,3,4),24);
    }
}
