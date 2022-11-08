package transport;

public class Car {
    private String brand = "default";
    private String model = "default";
    private double engineVolume = 1.5;
    private String color = "белый";
    private int productionYear = 2000;
    private String  productionCountry = "default";

    //В этом классе не буду мудрить с билдером, просто в конструкторе пропишу проверку вводимых значений
    //Хотя в этом классе полей уже больше, чем в Human, а значит и шансов ошибиться в очередности указываемых значений
    public Car(String brand, String model, int productionYear, String productionCountry, String color, double engineVolume) {
        if (checkInputString(brand)) {
            this.brand = brand;
        }
        if (checkInputString(model)) {
            this.model = model;
        }
        if (checkInputString(color)) {
            this.color = color;
        }
        if (checkInputString(productionCountry)) {
            this.productionCountry = productionCountry;
        }

        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        }
        if (productionYear > 0) {
            this.productionYear = productionYear;
        }
    }

    public Car() {
    }

    public boolean checkInputString(String string) {
        return string.length() > 0;
    }
    //Если проверку прописать только в конструкторе, то при альтернативном создании класса
    //и заполнении его полей получается, что значения не проверяются...
    //Значит и в сеттерах надо дублировать код прописывая проверку...
    public void setBrand(String brand) {
        if (checkInputString(brand)) {
            this.brand = brand;
        }
    }

    public void setModel(String model) {
        if (checkInputString(model)) {
            this.model = model;
        }
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        }
    }

    public void setColor(String color) {
        if (checkInputString(color)) {
            this.color = color;
        }
    }

    public void setProductionYear(int productionYear) {
        if (productionYear > 0) {
            this.productionYear = productionYear;
        }
    }

    public void setProductionCountry(String productionCountry) {
        if (checkInputString(productionCountry)) {
            this.productionCountry = productionCountry;
        }
    }

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
