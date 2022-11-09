public class Human {

    //Сразу присвоим значения полям
    //Если при создании объекта будет указано правильное значение, то это значение и будет присвоено полю
    //Присвоение значений полям сделано специально для выполнения условия задачи
    //Учитывая использование шаблона проектирования "строитель", проверка и инициализация полей объекта Human
    //должно происходить только там

    String none = "*** Информация не указана ***";
    private int yearOfBirth = 0;
    private String town = none;

    String name = none;
    String jobTitle = none;

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 0) {this.yearOfBirth = yearOfBirth;}
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public String getTown() {
        return town;
    }
    public void setTown(String town) {
        if (checkInputString (town)) {
            this.town = town;
        }
    }

    public void setName(String name) {
        if (checkInputString (name)) {
            this.name = name;
        }
    }
    public String getName() {
        return name;
    }

    public void setJobTitle(String jobTitle) {
        if (checkInputString (jobTitle)) {
            this.jobTitle = jobTitle;
        }
    }
    public String getJobTitle() {
        return jobTitle;
    }

    //Конструктор БЕЗ параметров
    public Human() {
    }

    //Конструктор с указанием значений приватных полей - для них нет сеттеров,
    //поэтому их обязательно включаем в конструктор
    //Остальные поля можно заполнить после создания объекта
    public Human(int yearOfBirth, String town) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        }
        if (checkInputString(town)) {
            this.town = town;
        }
    }

    //Вспомогательный метод для проверки вводимых текстовых значений полей.
    //Использую этот метод, т.к. поля "имя", "город", "должность" - текстовые, имеют один тип.
    //Делаю проверку по длине вводимого текста:
    //Если string.length() == 0 (например значение поля указано ""), то результат false.
    //Если длина строки больше нуля, то какое-то значение указано.

    //В данном примере проверку на null и "пустоту" считаю избыточной,
    //т.к. "на входе" никак не может быть такого,
    //потому что в конструкторе при создании объекта мы всегда что-то передаем,
    //не передав через конструктор правильные данные,
    // (я говорю о типе данных, а не о содержимом) - объект не будет создан.
    //Но, если по условию задачи такую проверку надо указать, то пусть будет.
    public boolean checkInputString (String string) {
        return string.length() > 0 && string != null && !string.isEmpty() && !string.isBlank();
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
