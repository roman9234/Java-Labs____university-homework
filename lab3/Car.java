public class Car {//характеристики: изготовитель, модель, год выпуска

    private String manufacturer;
    private String model;
    private int year_of_production;


    public Car(String manufacturer, String model, int year_of_production) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year_of_production = year_of_production;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear_of_production() {
        return year_of_production;
    }

    public void setYear_of_production(int year_of_production) {
        this.year_of_production = year_of_production;
    }

}
