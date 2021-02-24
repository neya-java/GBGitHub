import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee human1 = new Employee("Sergey", "Arlashkin", "Aleksandrovich", "Technical Director",
                "sergey_arlash@mail.ru", 89273604420L, 99999, (byte)35);

        human1.printCreateAnEmployee();

        Employee[] person_array = new Employee[5];

        person_array[0] = new Employee("Sergey", "Arlashkin", "Aleksandrovich", "Technical Director",
                    "sergey_arlash@mail.ru", 89273604420L, 99999, (byte)35);
        person_array[1] = new Employee("Sergey1", "Arlashkin1", "Aleksandrovich1", "Technical Director1",
                    "sergey_arlash1@mail.ru", 89273604421L, 100000, (byte)39) ;
        person_array[2] = new Employee("Sergey2", "Arlashkin2", "Aleksandrovich2", "Technical Director2",
                    "sergey_arlas2h@mail.ru", 89273604422L, 100001, (byte)43) ;
        person_array[3] = new Employee("Sergey3", "Arlashkin3", "Aleksandrovich3", "Technical Director3",
                    "sergey_arlash3@mail.ru", 89273604423L, 100002, (byte)47) ;
        person_array[4] = new Employee("Sergey4", "Arlashkin4", "Aleksandrovich4", "Technical Director4",
                    "sergey_arlash@mail.ru4", 89273604424L, 1000003, (byte)52);

//        System.out.println(person_array[0].getAge());
//        System.out.println(person_array[1].getAge());
//        System.out.println(person_array[2].getAge());
//        System.out.println(person_array[3].getAge());
//        System.out.println(person_array[4].getAge());

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст с которого вам нужно показывать сотрудников: ");
        byte age_filter = sc.nextByte();
        System.out.println("Сотрудники с возрастом более " + age_filter + " лет:");
        for (int i = 0; i <= person_array.length-1; i++) {
            if (person_array[i].getAge() > age_filter) {
                person_array[i].printCreateAnEmployee();
            }
        }
    }
}
