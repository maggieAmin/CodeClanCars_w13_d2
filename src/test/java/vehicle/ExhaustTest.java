package vehicle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExhaustTest {

    Exhaust exhaust;

    @Before
    public void before(){
        exhaust = new Exhaust(400);
    }

    @Test
    public void getPrice() {
        assertEquals(400, exhaust.getPrice());
    }

    @Test
    public void setPrice() {
        exhaust.setPrice(200);
        assertEquals(200, exhaust.getPrice());

    }
}