import transport.Car;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       //Задания по классу "Human"

        System.out.println("Результат выполнения заданий по классу \"Human\":");
        //Передача параметров полей ранее созданным объектам Human через конструктор
        System.out.println("Объекты класса Human, значения полей которых заданы через конструктор:");
        Human Максим = new Human(1981, "Гродно");
        Максим.setName("Максим");
        Максим.setJobTitle("");
        System.out.println(Максим);

        Human Аня = new Human(1998, "Москва");
        Аня.setName("Аня");
        Аня.setJobTitle("заместитель генерального директора");
        System.out.println(Аня);

        Human Катя = new Human(1993, "");
        System.out.println(Катя);

        Human Артем = new Human(-5, "Москва");
        System.out.println(Артем);

        System.out.println();

        //Создадим объект типа Human - Владимир
        Human Владимир = new Human(2001, "Казань");
        Владимир.setName("Владимир");
        System.out.println(Владимир);
        System.out.println();

        //Создадим объект Human с пустыми полями через конструктор
        System.out.println("Создадим объект Human с пустыми полями через конструктор:");
        Human testHuman_1 = new Human(-100, "");
        System.out.println(testHuman_1);
        System.out.println();

        /*//Создадим объект Human используя builder
        System.out.println("Создадим объект Human используя builder:");
        Human testHuman_2 = new Human.HumanBuilder().setName("Андрей").setYearOfBirth(2000).build();
        Human testHuman_3 = new Human.HumanBuilder().setTown("Tokyo").build();
        Human testHuman_4 = new Human.HumanBuilder().build();
        //Используя проще указывать верные значения полей
        //И нет жесткой привязки к конструктору, если не все поля можем ввести
        System.out.println(testHuman_2);
        System.out.println(testHuman_3);
        System.out.println(testHuman_4);*/

        System.out.println();
        System.out.println("----------------------------------------------------------------------");

        //Задания по классу "Car"
        System.out.println("Результат выполнения задания по классу \"Car\":");
        System.out.println();
        //Создание объектов Car
        System.out.println("Создание объектов Car:");

        Car ladaGranta = new Car("Lada", "Granta", 2015, "Россия", "седан", 4);
        ladaGranta.setColor("синий");
        ladaGranta.setTransmission("механика");
        ladaGranta.setRegNumber("У023ВВ999");
        ladaGranta.setWinterTires("summer tyres");
        //Здесь меняем тип шин
        ladaGranta.seasonalTireChange("winter");
        //Добавим поля "ключ" и "страховка"
        //Если этого не сделать, то будет ошибка NPE при просмотре информации по объекту,
        //т.к. в методе toString идет обращение к полям несозданного еще объекта Key (то же и с Insurance).
        Car.Key keyForLadaGranta = ladaGranta.new Key ("нет", "есть");
        ladaGranta.setKey(keyForLadaGranta);
        Car.Insurance insuranceForLadaGranta = ladaGranta.new Insurance ("01.01.2023", 46000.45, 666666666);
        ladaGranta.setInsurance (insuranceForLadaGranta);
        System.out.println(ladaGranta);


        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "пикап", 6);
        audiA8.setColor("черный");
        audiA8.setEngineVolume(3.0);
        audiA8.setColor("синий");
        audiA8.setTransmission("автомат");
        audiA8.setRegNumber("Г456СС003");
        audiA8.setWinterTires("summer tyres");
        Car.Key keyForAudiA8 = audiA8.new Key ("есть", "есть");
        audiA8.setKey(keyForAudiA8);
        Car.Insurance insuranceForA8 = audiA8.new Insurance ("01.05.2023", 23677.15, 999999666);
        audiA8.setInsurance (insuranceForA8);
        System.out.println(audiA8);

        Car bmwZ8 = new Car("BMW", "Z8", 2021, "Германия", "универсал", 4);
        bmwZ8.setColor("черный");
        bmwZ8.setEngineVolume(3.0);
        bmwZ8.setTransmission("");
        bmwZ8.setRegNumber("М123ФФ333");
        bmwZ8.setWinterTires("winter tyres");
        Car.Key keyForBmwZ8 = bmwZ8.new Key ("есть", "есть");
        bmwZ8.setKey(keyForBmwZ8);
        Car.Insurance insuranceForBmwZ8 = bmwZ8.new Insurance ("01.11.2023", 93677.15, 111222666);
        bmwZ8.setInsurance (insuranceForBmwZ8);
        System.out.println(bmwZ8);

        Car kiaSportage = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "универсал", 4);
        kiaSportage.setColor("красный");
        kiaSportage.setEngineVolume(2.4);
        kiaSportage.setTransmission("механика");
        kiaSportage.setRegNumber("Р000КК555");
        kiaSportage.setWinterTires("winter tyres");
        Car.Key keyForKiaSportage = kiaSportage.new Key ("есть", "есть");
        kiaSportage.setKey(keyForKiaSportage);
        Car.Insurance insuranceForKiaSportage = kiaSportage.new Insurance ("01.11.2023", 93677.15, 111111666);
        kiaSportage.setInsurance (insuranceForKiaSportage);
        System.out.println(kiaSportage);


        Car hyundaiAvante = new Car("Hyundai", "Avante", 2016, "Южная Корея", "седан", 2);
        hyundaiAvante.setColor("оранжевый");
        hyundaiAvante.setEngineVolume(1.6);
        hyundaiAvante.setRegNumber("В444УУ888");
        hyundaiAvante.setWinterTires("summer tyres");
        Car.Key keyForHyundaiAvante = hyundaiAvante.new Key ("нет", "нет");
        hyundaiAvante.setKey(keyForHyundaiAvante);
        Car.Insurance insuranceForHyundaiAvante = hyundaiAvante.new Insurance ("12.12.2023", 13677.15, 222222666);
        hyundaiAvante.setInsurance (insuranceForHyundaiAvante);
        System.out.println(hyundaiAvante);
        System.out.println();

        //Создадим объект Car с пустыми полями
        System.out.println("Создадим объект Car с пустыми полями:");
        Car testCar = new Car("AAAA", "", 2030, "", "", -6);
        Car.Key keyForTestCar = testCar.new Key ("нет", "нет");
        testCar.setKey(keyForTestCar);
        Car.Insurance insuranceForTestCar = testCar.new Insurance ("01.01.2000", 43677.95, 0);
        testCar.setInsurance (insuranceForTestCar);
        System.out.println(testCar);
        System.out.println();
        //Проверим срок действия страховки для тестового объекта
        insuranceForTestCar.checkDuration(testCar);
        System.out.println("----------------------------------------------------------------------");

        //Задания по классу "Flower"

        System.out.println("Результат выполнения заданий по классу \"Flower\":");

        Flower Роза = new Flower();
        Роза.setName("Роза обыкновенная");
        Роза.setCountry("Голландия");
        Роза.setCost(35.59);
        System.out.println(Роза);

        Flower Хризантема = new Flower();
        Хризантема.setName("Хризантема");
        Хризантема.setCost(15);
        Хризантема.setLifeSpan(5);
        System.out.println(Хризантема);

        Flower Пион = new Flower();
        Пион.setName("Пион");
        Пион.setCountry("Англия");
        Пион.setCost(69.9);
        Пион.setLifeSpan(1);
        System.out.println(Пион);

        Flower Гипсофила = new Flower();
        Гипсофила.setName("Гипсофила");
        Гипсофила.setCountry("Турция");
        Гипсофила.setCost(19.5);
        Гипсофила.setLifeSpan(10);
        System.out.println(Гипсофила);

        //Букет - это множество отдельных цветов, поэтому использую ArrayList
        //Каждый букет уникален, поэтому один букет - один список.
        //ArrayList удобнее, т.к. к каждому элементу можно обратиться по индексу в цикле.
        ArrayList <Flower> bouquet_1 = new ArrayList<>();
        //Добавим в букет 3 розы и 2 хризантемы
        bouquet_1.add(Роза);
        bouquet_1.add(Роза);
        bouquet_1.add(Роза);
        bouquet_1.add(Хризантема);
        bouquet_1.add(Хризантема);
        //Обратимся к методу из класса Flower для просмотра информации по букету
        Flower.viewBouquet(bouquet_1);

    }
}