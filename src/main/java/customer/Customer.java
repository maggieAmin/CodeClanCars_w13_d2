package customer;

import customer.behaviours.iSellable;
import vehicle.Vehicle;

import java.util.ArrayList;

public class Customer {
    private String name;
    private int wallet;
    private int age;
    public String licenceNumber;
    public ArrayList<Vehicle> vehicles;
    private ArrayList<iSellable> spare_parts;

    public Customer(String name, int wallet, int age, String licenceNumber, ArrayList<Vehicle> vehicles) {
        this.name = name;
        this.wallet = wallet;
        this.age = age;
        this.licenceNumber = licenceNumber;
        this.vehicles = vehicles;
        spare_parts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getWallet() {
        return wallet;
    }

    public int getAge() {
        return age;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }
    public ArrayList<iSellable> getSpareParts(){
        return this.spare_parts;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
    public void addSparePart(iSellable part){
        this.spare_parts.add(part);
    }

    public void damageVehicle(Vehicle vehicle1, int i) {
        vehicle1.addDamage(i);
    }

    public void charge(int i) {
        this.wallet -= i;
    }

    public void buyVehicle(Vehicle vehicle) {
        this.wallet -= vehicle.getPrice();
        this.vehicles.add(vehicle);
    }
}
