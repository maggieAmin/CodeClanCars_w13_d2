package vehicle;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class VehicleTest {

    Vehicle MaggiesWheels;
    Engine engine;
    Tyres tyre;
    Exhaust exhaust;
    Radio radio;
    ArrayList<Tyres> tyresList1;

    @Before
    public void before(){
        tyre = new Tyres("Louis Viton", 800);
        tyresList1 = new ArrayList<Tyres>(Arrays.asList(tyre, tyre, tyre,tyre));
        MaggiesWheels = new Vehicle("Armani", "Ferrari", engine, tyresList1,"2000",radio, exhaust,20000000,0);
    }

    @Test
    public void getModel() {
        assertEquals("Armani", MaggiesWheels.getModel());
    }

    @Test
    public void getManufacturer() {
        assertEquals("Ferrari", MaggiesWheels.getManufacturer());
    }

    @Test
    public void getEngine() {
        assertEquals(engine, MaggiesWheels.getEngine());
    }

    @Test
    public void getTyres() {
        assertEquals(tyresList1, MaggiesWheels.getTyres());
    }

    @Test
    public void getYearOfProduction() {
        assertEquals("2000", MaggiesWheels.getYearOfProduction());
    }

    @Test
    public void getRadio() {
        assertEquals(radio, MaggiesWheels.getRadio());
    }

    @Test
    public void getExhaust() {
        assertEquals(exhaust, MaggiesWheels.getExhaust());
    }

    @Test
    public void getPrice() {
        assertEquals(20000000, MaggiesWheels.getPrice());
    }

    @Test
    public void getDamageCost() {
        assertEquals(0, MaggiesWheels.getDamageCost());
    }

    @Test
    public void canAddDamage(){
        MaggiesWheels.addDamage(99);
        assertEquals(99, MaggiesWheels.getDamageCost());
    }

    @Test
    public void canRemoveDamage(){
        MaggiesWheels.removeDamage(150);
        assertEquals(-150, MaggiesWheels.getDamageCost());
    }
}