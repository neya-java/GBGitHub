public class Main {
    public static void main(String[] args) {
        String[][] arr4To4 = {
                {"2", "8", "9", "4"},
                {"1", "8", "9", "4"},
                {"1", "8", "%", "4"},
                {"1", "8", "9", "5"},
//                {"1", "8", "9", "5"}
        };
        try {
            System.out.println(sumArray (arr4To4));
        } catch (MyArraysSizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    /**
     * вычисляет сумму чесел массива
     * @param arr4To4 должнен быть размером 4x4 и содержать целые числа.
     * Иначе MyArraysSizeException или MyArrayDataException(i, j)
     **/
    public static int sumArray(String[][] arr4To4) throws MyArraysSizeException, MyArrayDataException {
        int sumArray = 0;
        if (arr4To4.length != 4) {
            throw new MyArraysSizeException("Массив не 4 на 4. Число строк: " + arr4To4.length);
        } else {
            for (int i = 0; i < arr4To4.length; i++) {
                for (int j = 0; j < arr4To4.length; j++) {
                    if (arr4To4[i].length != 4) {
                        throw new MyArraysSizeException("Массив не 4 на 4. Не корректная длинна стороки №: " + i);
                    } else {
                        try {
                            sumArray += Integer.parseInt(arr4To4[i][j]);
                        } catch (NumberFormatException e) {
                            throw new MyArrayDataException("Не число в ячейке: " +i + " " + j);
                        }
                    }
                }
            }
        }
        return sumArray;
    }
}

