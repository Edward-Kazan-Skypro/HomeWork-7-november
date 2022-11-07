public class Human {

    //Сразу присвоим значения полям
    //Если при создании объекта будет указано правильное значение, то это значение и будет присвоено полю
    //Присвоение значений полям сделано специально для выполнения условия задачи
    //Учитывая использование шаблона проектирования "строитель", проверка и инициализация полей объекта Human
    //должно происходить только там

    String none = "!!! Информация не указана !!!";
    private int yearOfBirth = 0;
    private String name = none;
    private String town = none;
    private String jobTitle = none;


    //Внутренний статический (для использования в методе main при создании объектов Human) класс
    //для создания объекта типа Human
    public static class HumanBuilder {
        String none = "!!! Информация не указана !!!";
        private int yearOfBirth = 0;
        private String name = none;
        private String town = none;
        private String jobTitle = none;

        private int getYearOfBirth() {
            return yearOfBirth;
        }

        private String getName() {
            return name;
        }

        private String getTown() {
            return town;
        }

        private String getJobTitle() {
            return jobTitle;
        }

        public HumanBuilder setYearOfBirth(int yearOfBirth) {
            if (yearOfBirth > 0) {
                this.yearOfBirth = yearOfBirth;
            }
            return this;
        }

        public HumanBuilder setName(String name) {
            if (name != null || !name.isEmpty()) {
                this.name = name;
            }
            return this;
        }

        public HumanBuilder setTown(String town) {
            if (town != null || !town.isEmpty()) {
                this.town = town;
            }
            return this;
        }

        public HumanBuilder setJobTitle(String jobTitle) {
            if (jobTitle != null || !jobTitle.isEmpty()) {
                this.jobTitle = jobTitle;
            }
            return this;
        }

        public Human build() {
            return new Human(this);
        }
    }

    //-----------------------------------------------------------------------------------------------

    //Комментарий целесообразности использования паттерна Builder
    //При создании объекта пользователь может не задать какой-либо из параметров
    //Значит придется писать все возможные варианты конструкторов
    //Варианты конструкторов:
    // пустой (без параметров)
    // год рождения
    // год рождений + имя
    // год рождения + город
    // год рождения + должность
    // год рождения + имя + город
    // год рождения + имя + должность
    // год рождения + город + должность
    // имя
    // имя + город
    // имя + город + должность
    // имя + должность
    // город
    // город + должность
    // должность
    // ...
    //Многовато...
    //К тому же неудобно помнить очередность указания полей при создании объекта
    //Поэтому и использую паттерн проектирования Builder
    //


    //Конструктор БЕЗ параметров - для первой части задания
    public Human() {
    }

    public Human(HumanBuilder human) {
        this.name = human.getName();
        this.town = human.getTown();
        this.jobTitle = human.getJobTitle();
        this.yearOfBirth = human.getYearOfBirth();
    }

    //Конструктор с указанием значений всех полей - для выполнения условия задачи
    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (checkInputString(name)) {this.name = name;}
        if (checkInputString(town)) {this.town = town;}
        if (checkInputString(jobTitle)) {this.jobTitle = jobTitle;}
        if (yearOfBirth < 0) {this.yearOfBirth = 0;}
    }


    public boolean checkInputString(String string) {
        return string != null || !string.isEmpty();
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }


    @Override
    public String toString() {
        return "Привет! Меня зовут " + name
                + ". Я из города " + town
                + ". Я родился в " + yearOfBirth + " году."
                + " Я работаю на должности " + jobTitle
                + ". Будем знакомы!";

    }
}
