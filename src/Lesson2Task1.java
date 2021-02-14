public class Lesson2Task1 {
    public static void main(String[] args) {
        System.out.println("Lesson2 #1");
        /*Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
            0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1};
        System.out.println("Длинна массива: " + array1.length);
        System.out.print("Массив array1:           ");
        int i;
        for (i = 0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.print("Инверсия массива array1: ");
        for (i = 0; i < array1.length; i++) {
            if (array1[i] == 0) {
                array1[i] = 1;
            } else {
                array1[i] = 0;
            }
            System.out.print(array1[i] + " ");
        }
        System.out.println(" ");
        System.out.println("----------------------------------------");
    }
}