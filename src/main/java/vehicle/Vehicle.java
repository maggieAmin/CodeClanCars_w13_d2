package vehicle;

import customer.behaviours.iSellable;

import java.util.ArrayList;

public class Vehicle implements iSellable {
    private String model;
    private String manufacturer;
    private Engine engine;
    private ArrayList<Tyres> tyres;
    private String yearOfProduction;
    private Radio radio;
    private Exhaust exhaust;
    private int price;
    private int damageCost;

    public Vehicle(String model, int price){
        this.model = model;
        this.price = price;
        this.manufacturer = "Default";
        this.engine = new Engine(1, "1998", "Default");
        this.tyres = new ArrayList<>();
        this.yearOfProduction = "1999";
        this.damageCost = 0;
        this.radio = new Radio(0, "Default");
        this.exhaust = new Exhaust(80);
    }

    public Vehicle(String model, String manufacturer, Engine engine, ArrayList<Tyres> tyres, String yearOfProduction, Radio radio, Exhaust exhaust, int price, int damageCost) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.tyres = tyres;
        this.yearOfProduction = yearOfProduction;
        this.radio = radio;
        this.exhaust = exhaust;
        this.price = price;
        this.damageCost = damageCost;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Engine getEngine() {
        return engine;
    }

    public ArrayList<Tyres> getTyres() {
        return tyres;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public Radio getRadio() {
        return radio;
    }

    public Exhaust getExhaust() {
        return exhaust;
    }

    public int getPrice() {
        return price;
    }

    public int getDamageCost() {
        return damageCost;
    }

    public void addDamage(int i) {
        this.damageCost += i;
    }

    public void removeDamage(int i) {
        this.damageCost -= i;
    }
}
