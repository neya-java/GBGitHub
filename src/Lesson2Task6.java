/* ** Написать метод, в который передается не пустой одномерный целочисленный массив,
            метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
            массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, ||
            2, 1]) → true, граница показана символами ||, эти символы в массив не входят*/

public class Lesson2Task6 {
    public static void main(String[] args) {

        System.out.println("Lesson2 #6");
        int [] array5 = {10, 1, 2, 4, 4, 2, 3};
        System.out.println("Вернуть true, если в массиве есть место, в котором сумма левой и правой части " +
                "массива равны : " + theSumsOnTheLeftAndRightAreEqualSumLeftOrRight(array5));

    }

    static boolean theSumsOnTheLeftAndRightAreEqualSumLeftOrRight(int [] array5) {
        int lenght_array = array5.length;
        System.out.println(lenght_array);
        int sumLeft = 0;
        int lenght_left = 0;
        int sumRight = 0;
        int lenght_right = 0;
        boolean y = false;

        for (int i = 1; i <= lenght_array - 1; i++) {
            lenght_left = i;
            lenght_right = lenght_array - lenght_left;
            System.out.println("Длинна левой части = " + lenght_left + "   "+ "Длинна правой части = " + lenght_right);
            sumLeft = 0;
            for (int a = 1; a <= lenght_left; a++) {
                sumLeft = sumLeft + array5[a - 1];
                sumRight = 0;
                for (int b = 1; b <= lenght_right; b++) {
                    sumRight = sumRight + array5[lenght_array - b];
                }
            }

            System.out.println("Сумма слева = " + sumLeft);
            System.out.println("Сумма справа = " + sumRight);

            if (sumLeft == sumRight) {
                System.out.println("Левая и правая часть равны! Выходим из цикла.");
                System.out.println();
                y = true;
                break;
            } else {
                System.out.println("Нет. Левая и правая часть не равны. Продолжаем поиск.");
                System.out.println();
            }
        }
        return  y;
    }
}


