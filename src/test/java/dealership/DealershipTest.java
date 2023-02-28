package dealership;

import customer.Customer;
import org.junit.Before;
import org.junit.Test;
import vehicle.Radio;
import vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class DealershipTest {
    Dealership dealership;
    Vehicle vehicle;
    ArrayList<Vehicle> vehiclesList;
    Customer maggie;
    ArrayList<Vehicle> MaggiesWheels;

    @Before
    public void before(){
        vehicle = new Vehicle("Fiat", 170000);
        vehiclesList = new  ArrayList<Vehicle>(Arrays.asList(vehicle));
        MaggiesWheels = new ArrayList<>();
        dealership = new Dealership("CodeClan", vehiclesList,1000000);
        maggie = new Customer("Maggie", 99999999, 23, "ABC123", MaggiesWheels);

    }

    @Test
    public void getName() {
        assertEquals("CodeClan", dealership.getName());
    }

    @Test
    public void getVehicles() {
        assertEquals(vehiclesList, dealership.getVehicles());
    }

    @Test
    public void getBankBalance() {
        assertEquals(1000000, dealership.getBankBalance());
    }

    @Test
    public void canRepairVehicle(){
        vehicle.addDamage(100);
        dealership.repair(maggie, vehicle, 50);
        assertEquals(50, vehicle.getDamageCost());
    }
    @Test
    public void canBuyCar(){
        int maggiesCashLeftover = maggie.getWallet() - vehicle.getPrice();
        int dealersBalanceAfterSale = dealership.getBankBalance() + vehicle.getPrice();

        dealership.sellCar(maggie, vehicle);
        assertEquals(MaggiesWheels, maggie.getVehicles());
        assertEquals(maggiesCashLeftover, maggie.getWallet());
        assertEquals(dealersBalanceAfterSale, dealership.getBankBalance());
    }
    @Test
    public void dealershipBuyVehicle(){
        Vehicle newCar = new Vehicle("Fancy", 200);
        int newBalance = dealership.getBankBalance() - newCar.getPrice();

        dealership.buyVehicle(newCar);
        assertEquals(newCar, dealership.getVehicles().get(1));
        assertEquals(newBalance, dealership.getBankBalance());
    }

    @Test
    public void sellSparePartToCustomer(){
        Radio radio = new Radio(20, "Value Radio");
        int maggiesWalletAfterBuying = maggie.getWallet() - radio.getPrice();
        int dealersBalanceAfterSelling = dealership.getBankBalance() + radio.getPrice();

        dealership.sellBodyPart(radio, maggie);

//        customer has spare part
        assertEquals(radio, maggie.getSpareParts().get(0));

//        customer charged
        assertEquals(maggiesWalletAfterBuying, maggie.getWallet());

//        dealership gets money
        assertEquals(dealersBalanceAfterSelling, dealership.getBankBalance());
    }

}