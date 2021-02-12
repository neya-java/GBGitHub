public class Lesson1Task7 {
    public static void main(String[] args) {
        System.out.print("Год високосный? :");
        leapYear(2077);
    }

    static void leapYear(int year) {
        if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
            System.out.println("Да. Год " + year + " високосный");
        } else {
            System.out.println(" Нет. Год " + year + " не високосный");
        }
    }
}
