public class Car {

    String type;
    String brand;
    int numOfSeats;
    double engineCapacity;
    String model;
    String fuelType;
    double costPerDay;

    public Car(String type, String brand, int numOfSeats, double engineCapacity, String model, String fuelType, double costPerDay) {
        this.type = type;
        this.brand = brand;
        this.numOfSeats = numOfSeats;
        this.engineCapacity = engineCapacity;
        this.model = model;
        this.fuelType = fuelType;
        this.costPerDay = costPerDay;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }
}
