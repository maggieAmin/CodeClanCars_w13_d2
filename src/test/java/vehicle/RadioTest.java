package vehicle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RadioTest {
    Radio radio;

    @Before
    public void before(){
        radio = new Radio(300, "Beats");

    }

    @Test
    public void getPrice() {
        assertEquals(300, radio.getPrice());
    }

    @Test
    public void getModel() {
        assertEquals("Beats", radio.getModel());
    }

    @Test
    public void setPrice() {
    }

    @Test
    public void setModel() {
    }
}