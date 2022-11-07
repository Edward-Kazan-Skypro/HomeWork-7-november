public class Main {
    public static void main(String[] args) {
        System.out.println();
        //Задания по классу "Human"

        /*Human Максим = new Human.HumanBuilder().setName("A").setTown("City").setYearOfBirth(-3).build();
        System.out.println(Максим.toString());*/
        System.out.println("Результат выполнения заданий:");
        //Создание объектов Human без конструктора
        Human Максим = new Human();
        Максим.setName("");
        Максим.setTown("Минск");
        Максим.setJobTitle("бренд-менеджер");
        Максим.setYearOfBirth(1988);
        System.out.println(Максим);

        Human Аня = new Human();
        Аня.setName("Аня");
        Аня.setTown("Москва");
        Аня.setJobTitle("методист образовательных программ");
        Аня.setYearOfBirth(1993);
        System.out.println(Аня);

        Human Катя = new Human();
        Катя.setName("Катя");
        Катя.setTown("Калининград");
        Катя.setJobTitle("продакт-менеджер");
        Катя.setYearOfBirth(1992);
        System.out.println(Катя);

        Human Артем = new Human();
        Артем.setName("Артем");
        Артем.setTown("Москва");
        Артем.setJobTitle("директор по развитию бизнеса");
        Артем.setYearOfBirth(1995);
        System.out.println(Артем);

        //Создание объектов Human через конструктор
       /* Human human_1 = new Human(1988, "Максим", "Минск", "бренд-менеджер");
        System.out.println(human_1.toString());

        Human human_2 = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        System.out.println(human_2.toString());

        Human human_3 = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        System.out.println(human_3.toString());

        Human human_4 = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
        System.out.println(human_4.toString());

        System.out.println();

        //Задание 3
        System.out.println("Результат выполнения задания 3:");
        Car ladaGranta = new Car("Lada", "Granta", 2015, "Россия", "желтый", 1.7);
        System.out.println(ladaGranta.toString());
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0);
        System.out.println(audiA8.toString());
        Car bmwZ8= new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0);
        System.out.println(bmwZ8.toString());

        Car kiaSportage = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красный", 2.4);
        System.out.println(kiaSportage.toString());
        Car hyundaiAvante = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6);
        System.out.println(hyundaiAvante.toString());*/


    }
}