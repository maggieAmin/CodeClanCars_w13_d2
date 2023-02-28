package vehicle;

import customer.behaviours.iSellable;

public class Radio implements iSellable {
    private int price;
    private String model;

    public Radio(int price, String model) {
        this.price = price;
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
