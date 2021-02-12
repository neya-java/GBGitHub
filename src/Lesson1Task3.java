public class Lesson1Task3 {
    public static void main(String[] args) {
        System.out.println("Сумма двух переданных чисел лежит в пределах" +
                " от 10 до 20? : " + checking_the_amount(5, 10 ));
    }
    static boolean checking_the_amount(int number1, int number2) {
        int s = number1 + number2;
        if (s >= 10 && s <= 20) {
            return true;
        } else {
            return false;
        }
    }
}