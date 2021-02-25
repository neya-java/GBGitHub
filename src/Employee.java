import java.util.Calendar;

/*1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
        2. Конструктор класса должен заполнять эти поля при создании объекта.
        3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в
        консоль.
        4. Создать массив из 5 сотрудников.
        Пример:
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "i vivan@mailbox.com" , "892312312",
        30000, 30); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person(...);
        ...
        persArray[4] = new Person(...);
        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.*/
public class Employee {
    private final String last_name;
    private final String first_name;
    private final String patronymic;
    private final String post;
    private final String e_mail;
    private final long phone_number;
    private final int salary;
    private int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int yearOfBirth) {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        this.age = year - yearOfBirth;
    }


    public Employee (String last_name, String first_name, String patronymic, String post, String e_mail,
                     long phone_number, int salary, int yearOfBirth) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.patronymic = patronymic;
        this.post = post;
        this.e_mail = e_mail;
        this.phone_number = phone_number;
        this.salary = salary;
        setAge(yearOfBirth);

    }

    void printCreateAnEmployee() {
        System.out.println("Имя: " + this.last_name + " / " + "Фамилия: " + this.first_name + " / " +
                "Отчество: " + this.patronymic  + " / " + "Должность: " + this.post + " / " +
                "Электронная почта: " + this.e_mail + " / " + "Телефон: " + this.phone_number + " / " +
                "Зарплата: " + this.salary + " / " + "Возраст: " + getAge());
        System.out.println();
    }
}
