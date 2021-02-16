public class Lesson2Task5 {
    public static void main(String[] args) {
        /*5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без
            помощи интернета);*/
        System.out.println("Lesson2 #5");
        int[] array4 = {1, 15, -100, 45694, -4156465, 454, 1, 0, 456, -45646};
        int max = array4[0];
        int min = array4[0];

        for (int i = 1; i < (array4.length-1); i++) {
            if ( max < array4[i]) {
                max = array4[i];
            } else {
                //Может когда-то пригодится. Предпочитаю всегда его писать
            }
        }

        System.out.println("Максимальное число в массиве: " + max);

        for (int i = 1; i < (array4.length-1); i++) {
            if ( min > array4[i]) {
                min = array4[i];
            } else {
                //Может когда-то пригодится. Предпочитаю всегда его писать
            }
        }
    }
}
