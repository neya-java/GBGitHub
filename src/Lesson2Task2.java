public class Lesson2Task2 {
    public static void main(String[] args) {
        /*Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его
            значениями 0 3 6 9 12 15 18 21;*/
        System.out.println("Lesson2 #2");
        int[] array2 = new int[8];
        System.out.print("Массив array2: ");
        int b = 0;
        for (int i = 0; i < array2.length; i++) {
            array2[i] = b;
            b = b + 3;
            System.out.print(array2[i] + " ");
        }
    }
}
