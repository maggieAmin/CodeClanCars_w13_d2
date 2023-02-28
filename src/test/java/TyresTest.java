import org.junit.Before;
import org.junit.Test;
import vehicle.Tyres;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres("Gucci", 9000);
    }

    @Test
    public void hasBrand(){
        assertEquals("Gucci", tyres.getBrand());
    }

    @Test
    public void hasPrice(){
        assertEquals(9000, tyres.getPrice());
    }
}
