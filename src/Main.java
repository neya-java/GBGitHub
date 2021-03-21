public class Main {
    public static void main(String[] args) {
        String [][] arr4To4 = {
                {"2", "8", "9", "4"},
                {"1", "8", "9", "4"},
                {"1", "8", "9", "4"},
                {"1", "8", "9", "p"}
        };

        summArray(arr4To4);
    }

    /**
     * вычисляет сумму чесел массива
     * @param arr4To4 должнен быть 4 на 4 и числовой.
     * Иначе MyArraysSizeException или MyArrayDataException(i, j)
     **/
    public static void summArray(String [][] arr4To4) {
        int summArray = 0;
        if (arr4To4.length != 4) {
            throw new MyArraysSizeException();
        } else {
            for (int i = 0; i < arr4To4.length; i++) {
                for (int j = 0; j < arr4To4.length; j++) {

                    if (arr4To4[i].length != 4) {
                        throw new MyArraysSizeException();
                    } else {
                        try {

                            summArray += Integer.parseInt(arr4To4[i][j]);
                        } catch (NumberFormatException e) {
                            throw new MyArrayDataException("Не число в ячейке: " +i + " " + j , i,j);
                        }
                    }
                }
            }
        }
        System.out.println(summArray);
    }
}

