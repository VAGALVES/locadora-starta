package br.com.startaideia.request;

public class CarRequest {
    private Integer id;
    private String model;
    private String brand;
    private String color;
    private String plate;
    private String chasi;
    private Number year;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getChasi() {
        return chasi;
    }

    public void setChasi(String chasi) {
        this.chasi = chasi;
    }

    public Number getYear() {
        return year;
    }

    public void setYear(Number year) {
        this.year = year;
    }
}
