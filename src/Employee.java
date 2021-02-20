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
    private String post;
    private String e_mail;
    private long phone_number;
    private int salary;
    private byte age;

    public Employee (String last_name, String first_name, String patronymic, String post, String e_mail,
                     long phone_number, int salary, byte age) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.patronymic = patronymic;
        this.post = post;
        this.e_mail = e_mail;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    static void metod123(Employee human1) {
        System.out.println("Имя: " + human1.last_name + " / " + "Фамилия: " + human1.first_name + " / " +
                "Отчество: " + human1.patronymic  + " / " + "Должность: " + human1.post + " / " +
                "Электронная почта: " + human1.e_mail + " / " + "Телефон: " + human1.phone_number + " / " +
                "Зарплата: " + human1.salary + " / " + "Возраст: " + human1.age);
    }

    public static void main(String[] args) {
        Employee human1 = new Employee("Sergey", "Arlashkin", "Aleksandrovich", "Technical Director",
                "sergey_arlash@mail.ru", 89273604420L, 99999, (byte)3);
        metod123(human1);
    }
}
