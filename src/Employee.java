import java.util.Scanner;

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
    private final byte age;

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

    static void createAnEmployee1(Employee human1) {
        System.out.println("Имя: " + human1.last_name + " / " + "Фамилия: " + human1.first_name + " / " +
                "Отчество: " + human1.patronymic  + " / " + "Должность: " + human1.post + " / " +
                "Электронная почта: " + human1.e_mail + " / " + "Телефон: " + human1.phone_number + " / " +
                "Зарплата: " + human1.salary + " / " + "Возраст: " + human1.age);
        System.out.println();
    }

    public static void createAnEmployee5(Employee[] persArray){
        persArray[0] = new Employee("Sergey", "Arlashkin", "Aleksandrovich", "Technical Director",
                "sergey_arlash@mail.ru", 89273604420L, 99999, (byte)35);
        persArray[1] = new Employee("Sergey1", "Arlashkin1", "Aleksandrovich1", "Technical Director1",
                "sergey_arlash1@mail.ru", 89273604421L, 100000, (byte)39) ;
        persArray[2] = new Employee("Sergey2", "Arlashkin2", "Aleksandrovich2", "Technical Director2",
                "sergey_arlas2h@mail.ru", 89273604422L, 100001, (byte)43) ;
        persArray[3] = new Employee("Sergey3", "Arlashkin3", "Aleksandrovich3", "Technical Director3",
                "sergey_arlash3@mail.ru", 89273604423L, 100002, (byte)47) ;
        persArray[4] = new Employee("Sergey4", "Arlashkin4", "Aleksandrovich4", "Technical Director4",
                "sergey_arlash@mail.ru4", 89273604424L, 1000003, (byte)51);
    }

    static void ageOverForty(Employee[] persArray) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст с которого вам нужно показывать сотрудников: ");
        int age_filter = sc.nextInt();
        System.out.println("Сотрудники с возрастом более " + age_filter + " лет:");
        for (int i = 0; i <= persArray.length-1; i++) {
            if (persArray[i].age > age_filter) {
                System.out.println(persArray[i].last_name + " / " +persArray[i].first_name + " / " + persArray[i].patronymic + " / " + persArray[i].post  + " / " +
                        persArray[i].e_mail + " / " + persArray[i].phone_number + " / " + persArray[i].salary + " / " + persArray[i].age);
            }
        }
    }

    public static void main(String[] args) {
        Employee human1 = new Employee("Sergey", "Arlashkin", "Aleksandrovich", "Technical Director",
                "sergey_arlash@mail.ru", 89273604420L, 99999, (byte)35);

        createAnEmployee1(human1);

        Employee[] persArray = new Employee[5];

        createAnEmployee5(persArray);

        ageOverForty(persArray);
    }
}
