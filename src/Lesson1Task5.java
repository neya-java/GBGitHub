public class Lesson1Task5 {
    public static void main(String[] args) {
        System.out.println("Переданное число отрицательное? : " + theCheckingForANegativeNumber(-100));
    }

    static boolean theCheckingForANegativeNumber(int number4) {
        if (number4 < 0 ) {
            return true;
        } else {
            return false;
        }
    }
}