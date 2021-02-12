public class Lesson1Task4 {
    public static void main(String[] args) {
        positiveOrNegative(156);
    }

    static void positiveOrNegative(int number3) {
        if (number3 >= 0) {
            System.out.println("Число " + number3 + ": положительное");
        } else {
            System.out.println("Число " + number3 + ": отрицательное");
        }
    }
}