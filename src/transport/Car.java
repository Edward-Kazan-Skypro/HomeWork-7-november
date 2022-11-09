package transport;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Car {

    //Неизменяемые поля
    private String brand = "default";
    private String model = "default";
    private int productionYear = 2000;
    private String  productionCountry = "default";
    private String bodyType = "default";
    private int numberOfSeats = 4;

    //Изменяемые поля
    double engineVolume = 1.5;
    String color = "белый";
    String transmission = "default";
    String regNumber = "x000xx000";
    String winterTires = "winter tyres";

    //Поля внутренних классов
    Car.Key key;
    Car.Insurance insurance;

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public String getProductionCountry() {
        return productionCountry;
    }
    public String getBodyType() {
        return bodyType;
    }
    public int getNumberOfSeats() {return numberOfSeats;}

    //В конструкторе указаны неизменяемые поля, которые можно задать только при создании объекта
    public Car(String brand, String model, int productionYear, String productionCountry, String bodyType, int numberOfSeats) {
        if (checkInputString(brand)) {
            this.brand = brand;
        }
        if (checkInputString(model)) {
            this.model = model;
        }
        if (productionYear > 0 && productionYear < LocalDate.now().getYear()) {
            this.productionYear = productionYear;
        }
        if (checkInputString(productionCountry)) {
            this.productionCountry = productionCountry;
        }
        if (checkInputString(bodyType)) {
            this.bodyType = bodyType;
        }
        if (numberOfSeats > 0) {
            this.numberOfSeats = numberOfSeats;
        }
    }

    //Метод замены типа шин - с зимней на летнюю и наоборот
    public void seasonalTireChange (String season) {
        if (season.equalsIgnoreCase("winter")) {
            setWinterTires("winter tyres");}
        if (season.equalsIgnoreCase("summer")) {
            setWinterTires("summer tyres");}
    }
    public static boolean checkInputString(String string) {
        return string.length() > 0 && string != null && !string.isEmpty() && !string.isBlank();
    }
    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setKey(Car.Key inputKey) {
        key = inputKey;
    }

    public void setInsurance(Car.Insurance inputInsurance) {
        insurance = inputInsurance;
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

    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        if (checkInputString(transmission)) {
            this.transmission = transmission;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (checkInputString(regNumber) & regNumber.length() == 9) {


            this.regNumber = regNumber;
        }
    }

     public String getWinterTires() {return winterTires;}

    public void setWinterTires(String winterTires) {
        if (checkInputString(winterTires)) {
            this.winterTires = winterTires;
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
                ", объем двигателя - " + engineVolume + " л.,\n" +
                "коробка передач: " + transmission +
                ", тип кузова: " + bodyType +
                ", регистрационный номер: " + regNumber +
                ", количество мест: " + numberOfSeats +
                ", тип покрышек: " + winterTires + "\n" +
                "удаленный запуск двигателя: " + key.getRemoteEngineStart() +
                ", бесключевой доступ: " + key.getKeylessEntry() + "\n" +
                "срок действия страховки до: " + insurance.getDuration() + " года" +
                ", стоимость страховки: " + insurance.getCost() +
                ", номер страхового полиса/договора: " + insurance.getNumber() + "\n";
    }

     public class Key {
        private String remoteEngineStart = "нет";
        private String keylessEntry = "нет";

        public String getRemoteEngineStart() {return remoteEngineStart;}

        public String getKeylessEntry() {return keylessEntry;}

        public Key(String remoteEngineStart, String keylessEntry) {
            if (checkInputString(remoteEngineStart)) this.remoteEngineStart = remoteEngineStart;
            if (checkInputString(keylessEntry)) this.keylessEntry = keylessEntry;
        }
    }

    public class Insurance{

        private String duration = "01.01.1990";
        private double cost = 0;
        private int number = 0;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        public Insurance(String duration, double cost, int number) {
            if (cost > 0) this.cost = cost;
            String numberAsString = String.valueOf(number);
            if (numberAsString.length() == 9) {
                this.number = number;
            }
            else {
                System.out.println("Неверно указан номер страховки!");
                System.out.println("Номер страховки не изменен, осталось значение по умолчанию.");
                System.out.println();
            }
            LocalDate dateFromInputDuration = LocalDate.parse(duration,formatter);
            if (dateFromInputDuration.isAfter(LocalDate.now())) this.duration = duration;
        }

        public void checkDuration (Car car){
            LocalDate localDate = LocalDate.now();
            LocalDate dateFromInsurance = LocalDate.parse(Car.Insurance.this.getDuration(),formatter);
            if (dateFromInsurance.isBefore(localDate)) {
                System.out.println("Срока действия страховки истек!");
                System.out.println("Пожалуйста, продлите Вашу страховую защиту.");
            }
        }

        public String getDuration() {
            return duration;
        }

        public double getCost() {
            return cost;
        }

        public int getNumber() {
            return number;
        }
    }

}
