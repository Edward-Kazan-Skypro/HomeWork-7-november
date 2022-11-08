import transport.Car;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       //Задания по классу "Human"

        System.out.println("Результат выполнения заданий по классу \"Human\":");
        //Передача параметров полей ранее созданным объектам Human через конструктор
        System.out.println("Объекты класса Human, значения полей которых заданы через конструктор:");
        Human Максим = new Human(1981, "Максим", "Гродно", "менеджер");
        System.out.println(Максим);

        Human Аня = new Human(1998, "Аня", "Москва", "заместитель генерального директора");
        System.out.println(Аня);

        Human Катя = new Human(1993, "Катя", "Владивосток", "инструктор");
        System.out.println(Катя);

        Human Артем = new Human(1996, "Артем", "Москва", "директор холдинга");
        System.out.println(Артем);

        System.out.println();

        //Создадим объект типа Human - Владимир
        Human Владимир = new Human(2001, "Владимир", "Казань", "");
        System.out.println(Владимир);
        System.out.println();

        //Создадим объект Human с пустыми полями через конструктор
        System.out.println("Создадим объект Human с пустыми полями через конструктор:");
        Human testHuman_1 = new Human(-100, "Василий", "", "");
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
        //Создание объектов Car, не передавая значения через конструктор
        System.out.println("Создание объектов Car, не передавая значения через конструктор:");
        Car ladaGranta = new Car();
        ladaGranta.setModel("Lada");
        ladaGranta.setBrand("Granta");
        ladaGranta.setProductionCountry("Россия");
        ladaGranta.setColor("желтый");
        ladaGranta.setEngineVolume(1.7);
        ladaGranta.setProductionYear(2015);
        System.out.println(ladaGranta);

        Car audiA8 = new Car();
        audiA8.setModel("Audi");
        audiA8.setBrand("A8 50 L TDI quattro");
        audiA8.setProductionCountry("Германия");
        audiA8.setColor("черный");
        audiA8.setEngineVolume(3.0);
        audiA8.setProductionYear(2020);
        System.out.println(audiA8);

        Car bmwZ8 = new Car();
        bmwZ8.setModel("BMW");
        bmwZ8.setBrand("Z8");
        bmwZ8.setProductionCountry("Германия");
        bmwZ8.setColor("черный");
        bmwZ8.setEngineVolume(3.0);
        bmwZ8.setProductionYear(2021);
        System.out.println(bmwZ8);

        Car kiaSportage = new Car();
        kiaSportage.setModel("Kia");
        kiaSportage.setBrand("Sportage 4-го поколения");
        kiaSportage.setProductionCountry("Южная Корея");
        kiaSportage.setColor("красный");
        kiaSportage.setEngineVolume(2.4);
        kiaSportage.setProductionYear(2018);
        System.out.println(kiaSportage);


        Car hyundaiAvante = new Car();
        hyundaiAvante.setModel("Hyundai");
        hyundaiAvante.setBrand("Avante");
        hyundaiAvante.setProductionCountry("Южная Корея");
        hyundaiAvante.setColor("оранжевый");
        hyundaiAvante.setEngineVolume(1.6);
        hyundaiAvante.setProductionYear(2016);
        System.out.println(hyundaiAvante);
        System.out.println();

        //Заполнение полей объектов Car, передавая их значения через конструктор
        System.out.println("Создание объектов Car, передавая значения через конструктор:");
        ladaGranta = new Car("Lada", "Granta", 2017, "Россия", "баклажан", 1.7);
        System.out.println(ladaGranta);
        audiA8 = new Car("Audi", "A8 50 L TDI quattro", 2021, "Германия", "черный", 3.0);
        System.out.println(audiA8);
        bmwZ8 = new Car("BMW", "Z8", 2022, "Германия", "синий", 3.0);
        System.out.println(bmwZ8);
        kiaSportage = new Car("Kia", "Sportage 4-го поколения", 2019, "Южная Корея", "зеленый", 2.4);
        System.out.println(kiaSportage);
        hyundaiAvante = new Car("Hyundai", "Avante", 2018, "Южная Корея", "оранжевый", 1.6);
        System.out.println(hyundaiAvante);
        System.out.println();
        //Создадим объект Car с пустыми полями
        System.out.println("Создадим объект Car с пустыми полями:");
        Car testCar = new Car("AAAA", "", 0, "", "", -6);
        System.out.println(testCar);
        System.out.println();
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
        //Каждый букет уникален, поэтому один букет - одна переменная (список цветов)
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