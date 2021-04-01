import java.security.Signature;
import java.util.Arrays;

public class Main{
//    private Object lock = new Object();

    public static void main(String[] args)  {
        final int SIZE = 10000000;
        final int HALF = SIZE / 2;

        // Для дальнейшего сравнения массивом
        float[] arrCalc1 = arrayCalc1(SIZE,HALF);
        float[] arrCalc2 = arrayCalc2(SIZE,HALF);
        float[] arrCalc2Test = arrayCalc2Test(SIZE,HALF);

        System.out.println("arrayCalc1 equals arrayCalc2 ? : " + Arrays.equals(arrCalc1, arrCalc2));
        System.out.println("arrayCalc1 equals arrayCalc2Test ? : " + Arrays.equals(arrCalc1, arrCalc2Test));
    }

    public static float[] arrayCalc1(int SIZE, int HALF){
        float[] arr1 = new float[SIZE];
        for (int i = 0; i < SIZE ; i++) {
            arr1[i] = 1;
        }

        System.out.println("Метод 1-н (arrayCalc1) начало: ");
        long timeStart = System.currentTimeMillis();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i / 5.0) * Math.cos(0.2f + i / 5.0) *
                    Math.cos(0.4f + i / 2.0));
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println("medod1: " + (timeFinish - timeStart) + "мс");
        System.out.println("Метод 1-н (arrayCalc1) конец ");
//        for (int i = 0; i < arr1.length ; i++) {
//            System.out.print(arr1[i] + " ");
//        }
        System.out.println();
        return arr1;
    }

    public static float[]  arrayCalc2(int SIZE, int HALF){
        float[] arr2 = new float[SIZE];
        for (int i = 0; i < SIZE ; i++) {
            arr2[i] = 1;
        }
        long timeStart = System.currentTimeMillis();
        System.out.println("Метод 2-ва (arrayCalc2) в двух потоках начало: ");

            float[] arr2to1 = new float[HALF];
            float[] arr2to2 = new float[HALF];

            System.arraycopy(arr2, 0,
                    arr2to1, 0,
                    HALF);
            System.arraycopy(arr2, HALF,
                    arr2to2, 0,
                    HALF);

            Thread thread1 = new Thread(() -> {
                for (int i = 0; i < arr2to1.length; i++) {
                    arr2to1[i] = (float) (arr2to1[i] * Math.sin(0.2f + i / 5.0) * Math.cos(0.2f + i / 5.0) *
                            Math.cos(0.4f + i / 2.0));
                }
            });

            Thread thread2 = new Thread(() -> {
                for (int i = 0; i < arr2to2.length; i++) {
                    arr2to2[i] = (float) (arr2to2[i] * Math.sin(0.2f + (i+HALF) / 5.0) * Math.cos(0.2f + (i+HALF) / 5.0) *
                            Math.cos(0.4f + (i+HALF) / 2.0));
                }
            });

            thread1.start();
            thread2.start();

            try {
                thread1.join();
                thread2.join();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.arraycopy(arr2to1, 0,
                    arr2, 0,
                    HALF);
            System.arraycopy(arr2to2, 0,
                    arr2, HALF,
                    HALF);

        long timeFinish = System.currentTimeMillis();
        System.out.println("medod2: " + (timeFinish - timeStart) + "мс");
        System.out.println("Метод 2-ва (arrayCalc2) в двух потоках конец ");
        System.out.println();

        return arr2;
    }

    public static float[] arrayCalc2Test(int SIZE, int HALF) {
        float[] arr3 = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr3[i] = 1;
        }

        System.out.println("Метод 2-ва (arrayCalc2Test) в одном потоке: ");
        long timeStart = System.currentTimeMillis();
        float[] arr3to1 = new float[HALF];
        float[] arr3to2 = new float[HALF];

        System.arraycopy(arr3, 0,
                arr3to1, 0,
                HALF);
        System.arraycopy(arr3, HALF,
                arr3to2, 0,
                HALF);

        for (int i = 0; i < arr3to1.length; i++) {
            arr3to1[i] = (float) (arr3to1[i] * Math.sin(0.2f + i / 5.0) * Math.cos(0.2f + i / 5.0) *
                    Math.cos(0.4f + i / 2.0));
        }

        for (int i = 0; i < arr3to2.length; i++) {
            arr3to2[i] = (float) (arr3to2[i] * Math.sin(0.2f + (i+HALF) / 5.0) * Math.cos(0.2f + (i+HALF) / 5.0) *
                    Math.cos(0.4f + (i+HALF) / 2.0));
        }

        System.arraycopy(arr3to1, 0,
                arr3, 0,
                HALF);
        System.arraycopy(arr3to2, 0,
                arr3, HALF,
                HALF);

        long timeFinish = System.currentTimeMillis();
        System.out.println("medod2 в одном потоке: " + (timeFinish - timeStart) + "мс");
        System.out.println("Метод 2-ва (arrayCalc2Test) в одном потоке конец ");
//        for (int i = 0; i < arr3.length ; i++) {
//            System.out.print(arr3[i] + " ");
//        }
        System.out.println();
        return arr3;
    }
}