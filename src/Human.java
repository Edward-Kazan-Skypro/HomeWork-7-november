public class Human {

    //Сразу присвоим значения полям
    //Если при создании объекта будет указано правильное значение, то это значение и будет присвоено полю
    //Присвоение значений полям сделано специально для выполнения условия задачи
    //Учитывая использование шаблона проектирования "строитель", проверка и инициализация полей объекта Human
    //должно происходить только там

    String none = "*** Информация не указана ***";
    private int yearOfBirth = 0;
    private String name = none;
    private String town = none;
    private String jobTitle = none;

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
    //... Многовато ...
    //К тому же неудобно помнить очередность указания полей при создании объекта
    //Поэтому и использую паттерн проектирования Builder для создания объекта Human
    //Информацию по паттерну "нагуглил", если избыточное решение, то удалю.

    //Конструктор с использованием объекта HumanBuilder
    public Human(HumanBuilder human) {
        this.name = human.getName();
        this.town = human.getTown();
        this.jobTitle = human.getJobTitle();
        this.yearOfBirth = human.getYearOfBirth();
    }

    //Конструктор БЕЗ параметров - для первой части задания
    public Human() {
    }

    //Конструктор с указанием значений всех полей - для выполнения условия задачи
    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (checkInputString(name)) {
            this.name = name;
        }
        if (checkInputString(town)) {
            this.town = town;
        }
        if (checkInputString(jobTitle)) {
            this.jobTitle = jobTitle;
        }
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        }
    }

    //Вспомогательный метод для проверки вводимых текстовых значений полей
    //Использую этот метод, т.к. поля "имя", "город", "должность" - текстовые, имеют один тип
    //Делаю проверку по длине вводимого текста:
    //Если string.length() == 0 (например значение поля указано ""), то результат false
    //Если длина строки больше нуля, то какое-то значение указано
    public boolean checkInputString (String string) {
        return string.length() > 0;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 0) {this.yearOfBirth = yearOfBirth;}
    }

    public void setName(String name) {
        if (checkInputString (name)) {
            this.name = name;
        }
    }

    public void setTown(String town) {
        if (checkInputString (town)) {
            this.town = town;
        }
    }

    public void setJobTitle(String jobTitle) {
        if (checkInputString (jobTitle)) {
            this.jobTitle = jobTitle;
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name
                + ". Я из города " + town
                + ". Я родился в " + yearOfBirth + " году."
                + " Я работаю на должности " + jobTitle
                + ". Будем знакомы!";

    }

    //-----------------------------------------------------------------------------------------------
    //Внутренний статический (для использования в методе main при создании объектов Human) класс
    //для создания объекта типа Human
    public static class HumanBuilder {
        String none = "*** Информация не указана ***";
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

        public boolean checkInputString (String string) {
            return string.length() > 0;
        }

        public HumanBuilder setYearOfBirth(int yearOfBirth) {
            if (yearOfBirth > 0) {
                this.yearOfBirth = yearOfBirth;
            }
            return this;
        }

        public HumanBuilder setName(String name) {
            if (checkInputString(name)) {
                this.name = name;
            }
            return this;
        }

        public HumanBuilder setTown(String town) {
            if (checkInputString(town)) {
                this.town = town;
            }
            return this;
        }

        public HumanBuilder setJobTitle(String jobTitle) {
            if (checkInputString(jobTitle)) {
                this.jobTitle = jobTitle;
            }
            return this;
        }

        public Human build() {
            return new Human(this);
        }
    }
}
