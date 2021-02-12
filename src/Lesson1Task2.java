public class Lesson1Task2 {
    public static void main(String[] args) {
        System.out.println("a * (b + (c/d)) = " + expression());
    }

    static float expression() {
        float a = 1.25f;
        float b = 2.25f;
        float c = 7f;
        float d = 3.5f;
        return a * (b + (c/d));
    }
}