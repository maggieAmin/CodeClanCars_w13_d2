import org.junit.Before;
import org.junit.Test;
import vehicle.Engine;

import static org.junit.Assert.assertEquals;

public class EngineTest {
    Engine engine1;

    @Before
    public void before(){
        engine1 = new Engine(8, "1999", "PX-30");
    }

    @Test
    public void hasSize(){
        assertEquals(8, engine1.getSize());
    }

    @Test
    public void hasYear(){
        assertEquals("1999", engine1.getYear());
    }

    @Test
    public void hasModel(){
        assertEquals("PX-30", engine1.getModel());
    }
}
