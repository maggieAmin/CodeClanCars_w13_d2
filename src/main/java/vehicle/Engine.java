package vehicle;

public class Engine {
    private int size;
    private String year;
    private String model;

    public Engine(int size, String year, String model) {
        this.size = size;
        this.year = year;
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public String getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }
}
