package entities;

public class Car {

    private int carId;
    private String carType;
    private String carModel;
    private int modelYear;
    private float price;

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    public Car(int carId,String carType, String carModel, int modelYear, float price) {
        this.carId = carId;
        this.carType = carType;
        this.carModel = carModel;
        this.modelYear = modelYear;
        this.price = price;
    }
}
