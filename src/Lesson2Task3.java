public class Lesson2Task3 {
    public static void main(String[] args) {
        /*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
            умножить на 2;*/
        System.out.println("Lesson2 #3");
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Заданный массив:               ");
        for (int i = 0; i < array3.length; i++){
            System.out.print(array3[i] + "    ");
        }
        System.out.println(" ");
        System.out.print("Все <(меньше) 6 умножаем на 2: ");
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] = (array3[i])*2;
            } else {
                //может когда-то понадобиться;
            }
            System.out.print(array3[i] + "    ");
        }
    }
}
