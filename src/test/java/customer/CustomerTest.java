package customer;


import org.junit.Before;
import org.junit.Test;
import vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Vehicle vehicle1;
    Vehicle vehicle2;
    ArrayList<Vehicle> SamVehiclesList;


    @Before
    public void before(){
        vehicle1 = new Vehicle("BMW",250000);
        SamVehiclesList = new ArrayList<>(Arrays.asList(vehicle1, vehicle2));
        customer = new Customer("Sam",1000000, 25, "123456",SamVehiclesList);
    }

    @Test
    public void getName() {
        assertEquals("Sam", customer.getName());
    }

    @Test
    public void getWallet() {
        assertEquals(1000000, customer.getWallet());
    }

    @Test
    public void getAge() {
        assertEquals(25, customer.getAge());
    }

    @Test
    public void getLicenceNumber() {
        assertEquals("123456", customer.getLicenceNumber());
    }

    @Test
    public void getVehicles() {
        assertEquals(SamVehiclesList, customer.getVehicles());
    }

    @Test
    public void canDamageVehicle() {
        customer.damageVehicle(vehicle1, 2000);
        assertEquals(2000, customer.getVehicles().get(0).getDamageCost());
    }

}