package dealership;

import customer.Customer;
import customer.behaviours.iSellable;
import vehicle.Vehicle;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private ArrayList<Vehicle> vehicles;
    private int bankBalance;

    public Dealership(String name, ArrayList<Vehicle> vehicles, int bankBalance) {
        this.name = name;
        this.vehicles = vehicles;
        this.bankBalance = bankBalance;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public int getBankBalance() {
        return bankBalance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }

    public void repair(Customer customer, Vehicle vehicle, int i) {
        customer.charge(i);
        this.bankBalance += i;
        vehicle.removeDamage(i);
    }

    public void sellCar(Customer customer, Vehicle vehicle) {
        customer.buyVehicle(vehicle);
        this.bankBalance += vehicle.getPrice();
    }

    public void buyVehicle(Vehicle newThing) {
        this.vehicles.add(newThing);
        this.bankBalance -= newThing.getPrice();
    }

    public void sellBodyPart(iSellable part, Customer customer) {
//        give part to customer
        customer.addSparePart(part);

//        charge the customer
        customer.charge(part.getPrice());

//        dealership gets money
        this.bankBalance += part.getPrice();
    }
}
