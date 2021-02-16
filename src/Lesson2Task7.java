/*7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть
        положительным, или отрицательным), при этом метод должен сместить все элементы
        массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя
        пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) ->
        [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг
        можете выбирать сами.*/


public class Lesson2Task7 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10, 11};
        int step_shift = -17;
        shiftingTheArrayInIncrements(array, step_shift);
    }

    static void shiftingTheArrayInIncrements(int[] array, int step_shift) {
        System.out.print("Исходый массив:        ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "  ");
        }
        System.out.println("  ");

        if (step_shift > 0 && step_shift > array.length || step_shift < 0 && step_shift < array.length) {
            step_shift = step_shift % array.length;
        }

        System.out.println(step_shift);
        if (step_shift == 0) {
            System.out.println("Укажите сдвиг отличный о нуля!");

        } else {
            if (step_shift > 0) {
                for (int number_of_shifts = 1; number_of_shifts <= step_shift; number_of_shifts++) {
                    /*вправо*/
                    int wave_array_last_element = array[array.length - 1];

                    for (int i = 0; i < array.length - 1; i++) {
                        array[array.length - i - 1] = array[array.length - 2 - i];
                    }
                    array[0] = wave_array_last_element;
                }
                System.out.print("Массив со сдвигом " + step_shift + ":   ");
                for (int i = 0; i < array.length; i++){
                    System.out.print(array[i] + "  ");
                }
                System.out.println("  ");
            } else {
                for (int number_of_shifts = 0; number_of_shifts > step_shift; number_of_shifts--) {
                    /*влево*/
                    int wave_array_zero_element = array[0];

                    for (int i = array.length; i > 1; i--) {
                        array[array.length - i] = array[array.length - i + 1];
                    }
                    array[array.length - 1] = wave_array_zero_element;
                }
                System.out.print("Массив со сдвигом " + step_shift + ":  ");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + "  ");
                }
                System.out.println("  ");
            }
        }
    }
}


