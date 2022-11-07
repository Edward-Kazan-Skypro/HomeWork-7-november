public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String  productionCountry;

    public Car(String brand, String model, int productionYear, String productionCountry, String color, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    //Lada Granta, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя — 1,7 л.


    @Override
    public String toString() {
        return "Информация по автомобилю " + brand + " " + model + "\n" +
                "марка: " + brand +
                ", модель: " + model + ", " +
                productionYear + " год выпуска" +
                ", сборка: " + productionCountry +
                ", цвет: " + color +
                ", объем двигателя - " + engineVolume + " л.";
    }
}
